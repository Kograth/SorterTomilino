package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.component.ehcache.EhcacheConstants;
import ru.cse.APILk.Service1c.GetDataPushExit;
import ru.cse.APILk.Service1c.GetDataPushExitResponse;
import ru.cse.APILk.Service1c.SaveErrors;
import ru.cse.Meashuring.Service1c.Measurement;
import ru.cse.proxysorter.Message.Request11;

public class ProcessorTreatmentErrors  implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        //Раннее добавили структуру ответа в 11 класс. Получим ее и сохраним в кэше.
//        Message in = exchange.getIn();
//        Request11 resourceResponse  =  in.getBody(Request11.class);
//
//        exchange.setProperty(String.valueOf(resourceResponse.getCodePLK()),resourceResponse.getErrorCode());
//
//        in.setHeader(EhcacheConstants.ACTION, EhcacheConstants.ACTION_PUT);
//        in.setHeader(EhcacheConstants.KEY, resourceResponse.getCodePLK()) ;


        Request11 Req11 = exchange.getIn().getBody(Request11.class);
        SaveErrors Reqto1C = new SaveErrors();
        if (!(Req11==null)) {

            Reqto1C.setBarcode(Req11.getBarcode1С());
            Reqto1C.setErrorCode(Req11.getErrorCode());


        } else {
           /* Reqto1C.setHeight(Float.valueOf(1));
            Reqto1C.setLength(Float.valueOf(1));
            Reqto1C.setWidth(Float.valueOf(1));
            Reqto1C.setWeight(Float.valueOf(1));
            Reqto1C.setNumber("request 11 is null");*/
        }



        Reqto1C.setInLogin(String.valueOf(2));

        Message Out = exchange.getMessage();// getOut();
        Out.setBody(Reqto1C);
        Out.setHeader(CxfConstants.OPERATION_NAME, "SaveErrors");
        Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client");
    }

}
