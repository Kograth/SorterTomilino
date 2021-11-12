/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import ru.cse.APILk.Service1c.GetDataPushExitResponse;
import ru.cse.APILk.Service1c.OutputParameters;
import ru.cse.proxysorter.Message.*;

import java.lang.Exception;
import ru.cse.proxysorter.ConstantsSorter;

/**
 *
 * @author 1
 */
public class ProcessorRequest1C implements Processor {

    short CommandCode = 0x11;
    int ProductCode;
    @Override
    public void process(Exchange exchange) throws Exception {

        Message In = exchange.getIn();
        CommandCode = (short) exchange.getProperty(ConstantsSorter.PROPERTY_COMANDCODE);
        ProductCode = (int) exchange.getProperty(ConstantsSorter.PROPERTY_PLK);

        /*if(CommandCode== Request21.MESSAGE_CODE) {

            Response22 returnAnswer = new Response22();
            returnAnswer.setStatus((int)exchange.getProperty("Status"));
            //returnAnswer.se(ProductCode);
            //returnAnswer.ToByte();
            Message Out = exchange.getOut();
            Out.setBody(returnAnswer);
        }*/
        //Взависимости от входящей команды выберим как будем отвечать
        if (CommandCode == Request11.MESSAGE_CODE) {
            GetDataPushExitResponse TrR = In.getBody(GetDataPushExitResponse.class);
            //Получим ответные параметры из 1с
            String ExitNumber = TrR.getSendExitNumber();
            String OutBarcode = TrR.getSendBarcode();
            Byte byteExitNumber = Byte.valueOf(ExitNumber);
            //Запишем свойство в сообщение
            exchange.setProperty(ConstantsSorter.PROPERTY_BARCODE, OutBarcode);
            //

            Response12 returnAnswer = new Response12();
            returnAnswer.setExitNumber(byteExitNumber);
            returnAnswer.setCodeProduct(ProductCode);

            //returnAnswer.ToByte();
            Message Out = exchange.getOut();
            Out.setBody(returnAnswer);
        }
        if (CommandCode == Request13.MESSAGE_CODE) {
            Response14 returnAnswer = new Response14();
            returnAnswer.SetSource((Short) exchange.getProperty("SourceSort"));
            returnAnswer.SetCodeProduct(ProductCode);
            Message Out = exchange.getOut();
            Out.setBody(returnAnswer);
        }
        if (CommandCode == Request15.MESSAGE_CODE) {
            //Режим работы команды не согласован
        }

        //Отправим событие ТСД в поток сортировщика
        //Код события 111
        if (CommandCode == Request111.MESSAGE_CODE) {
            //ReplacingTheBag AnswerFrom1C = In.getBody(ReplacingTheBag.class);
            Response18 returnAnswer = new Response18();
            //String PropertyExit = new String(exchange.getProperty("ExitForNewBag"));
            byte exit = 91;
            returnAnswer.setExitNumber(exit);
            returnAnswer.ToByte();
            Message Out = exchange.getOut();
            Out.setBody(returnAnswer);

        }

    }
}
