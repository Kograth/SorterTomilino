/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;

import org.apache.camel.builder.RouteBuilder;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.ehcache.EhcacheConstants;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.ehcache.core.Ehcache;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Processors.*;

/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        //********************************************************
        // Секция команды 11
        //INFO SERVER NAME te1; 185.65.22.28; 10.0.0.137

        from("netty4:tcp://{{portNumber}}:4991?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true&requestTimeout=10000&keepAlive=true")
                .process( new ProcessorUpdateHeader())
                .choice()
                .when(header(ConstantsSorter.SOURCE_SORTER).isEqualTo("1"))
                        //.to("log:Request21?showAll=true&multiline=true")
                        .to("direct:Request21")
                .when(header(ConstantsSorter.SOURCE_SORTER).isEqualTo("0"))
                    //.otherwise()
                        .to("log:Request11?showAll=true&multiline=true")
                        .to("seda:Request11").threads(4,10)
                        .to("log:Request11_ANSWER?showAll=true&multiline=true")

                .end()

                ;

        //********************************************************
        // Секция команды 13

        from("netty4:tcp://{{portNumber}}:4992?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true&keepAlive=true")
                .to("direct:Request13");

        // Секция открытия\закрытия\снятия выхода\мешка (Принцип ActiveMQ)
        //***********************************************************//

        from("netty4:tcp://{{portNumber}}:4993?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true&keepAlive=true")
                .delay(300)
                .pollEnrich("activemq:queue:Sorter.enrichMsg",-1, new UpdateOpenGate());

        //Сообщения от ТСД
//        from("netty:tcp://{{portNumber}}:4999?decoders=#length-DecoderSorterTlg&sync=false")
//                .choice()
//                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request111'")).to("direct:Request111").otherwise()
//                .to("activemq:queue:Sorter.enrichMsg");


        //***********************************************************

        //********Проверка связи*************************************
        from("netty4:tcp://{{portNumber}}:4994?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true&keepAlive=true")
                .to("direct:Request21");
        //***********************************************************

        //Получили исходные данные, надо отправить запрос в 1с и сохранить соспоставление PLU - Штрихкод
        from("seda:Request11")
                .enrich("direct:RequestFrom1c", new Req11And1CAgregate())
                .to(ExchangePattern.InOnly,"direct:SaveToRepoSorter")
                .choice()
                .when(header(ConstantsSorter.PROPERTY_RSCEIVEDCSP).isEqualTo("0")).to(ExchangePattern.InOnly,"activemq:queue:Meashure").end()
                //Сохраним ошибка в 1с если выход равен 1
                .choice()
                .when(header(ConstantsSorter.ERROR_STATE).isEqualTo("1"))
                    .enrich("direct:Answer12",new Res12Agregate())
                    .to(ExchangePattern.InOnly,"direct:Errors")
                .otherwise()
                    .process(new Req11toResp12())
                .end();
//Получили исходные данные, надо отправить запрос в 1с, предварительно сконвертировав PLU в Штрихкод
        from("direct:Request13")
                .process(new ProcessorRequestSorter())
                .to("direct:ReadToRepoSorter")
                .to(ExchangePattern.InOnly,"activemq:queue:FullBagAndCreateDocumentIn1C")//.to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                ;
//Описание процесса получения 21 телеграммы проверка состоянии шлюза
        from("direct:Request21")
                //.process(new ProcessorRequestSorter())
                .process(new ProcessorResponseLink());

        from("direct:Answer12").process(new Req11toResp12());

//111 код снятия мешка с ТСД отправляемый в 1C
        //Отсутсвует понятие мешка в этой модели
//        from("direct:Request111")
//           .process(new Req111To1C()).to("activemq:queue:Sorter.FullBagAndCreateDocumentIn1C");

//        from("activemq:queue:Sorter.1CReplacingTheBag").to("cxf:bean:reportIncident");
            //    to("cxf:bean:reportIncident");

//Все остальные операции, смена мешка и т.д.
        from("direct:RequestANY")
                .process(new ProcessorRequestSorter())
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                ;

//Прочитаем сопоставление PLU Штрих код
        from("direct:ReadToRepoSorter")
                    .setHeader(EhcacheConstants.ACTION, constant(EhcacheConstants.ACTION_GET))
                    .setHeader(EhcacheConstants.KEY, exchangeProperty(ConstantsSorter.PROPERTY_PLK))
                    .enrich ("ehcache://SorterPluBarcodeCache?keyType=java.lang.Integer" , new Req13Agregate());

        //Посылки которые получили выход в дамшут необходимо доболнительно сохранить в 1С
        from("direct:Errors")
                    .process(new ProcessorTreatmentErrors())
                    .to("log:ThreatmentErrorsAnswer?showAll=true&multiline=true")
                    .to("cxf:bean:reportIncident");
                    //.to("ehcache://SorterPluErrorStructure?keyType=java.lang.Integer");

//Сохраним значение сопоставления PLU - штрих код
        from("direct:SaveToRepoSorter")
                .process(new ProcessorSaveToRepoSorter())
                .to("ehcache://SorterPluBarcodeCache?keyType=java.lang.Integer");


// своего рода подзапрос в 1с для получения правильного штрих кода и номера выхода -->
       from("direct:RequestFrom1c")
               .process(new ProcessorRequestSorter())
               //.to(ExchangePattern.InOut,"activemq:queue:Sorter.Request11To1C")
               .to("cxf:bean:reportIncident")
              ;
        //from("timer://test?fixedRate=true&period=90000").to("activemq:queue:Meashure");

 //Отправим весогабариты в 1с
        from("activemq:queue:Meashure")
                .process(new Processor13ToMeashure())
                .to("log:Meashure_REQUEST?showAll=true&multiline=true&showBody=true")
                .to("cxf:bean:MeashurementIncident")
                .to("log:Meashure_ANSWER?showAll=true&multiline=true&showBody=true");
    }
}

