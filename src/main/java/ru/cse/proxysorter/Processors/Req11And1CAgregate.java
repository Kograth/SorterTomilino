/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.camel.Exchange;
//import org.apache.camel.processor.aggregate.AggregationStrategy;
//import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.APILk.Service1c.GetDataPushExitResponse;
import ru.cse.APILk.Service1c.OutputParameters;
import ru.cse.proxysorter.ConstantsSorter;
import ru.cse.proxysorter.Message.Request11;

/**
 *
 * @author Oleynik
 */
public class Req11And1CAgregate  implements AggregationStrategy{


    public Exchange aggregate(Exchange original, Exchange resource) {
        Request11 originalBody = original.getIn().getBody(Request11.class);
        GetDataPushExitResponse resourceResponse = resource.getIn().getBody(GetDataPushExitResponse.class);
        Request11 mergeResult = originalBody;


        /*
        1С вернул код ошибки добавим его в сообщение
        */
        Integer ErrorCodeNumber = resourceResponse.getOutputParameters();
        if (ErrorCodeNumber==null) {
            ErrorCodeNumber = 0;
        }
        mergeResult.setErrorCode(ErrorCodeNumber.intValue());
        mergeResult.setBarcode1С(resourceResponse.getSendBarcode());

        String bsrcode = (String) resourceResponse.getSendBarcode();
        //int ErrorCode = resourceResponse.getOutputParameters();
        String exitNumber = resourceResponse.getSendExitNumber();
        originalBody.setBarcode1С(bsrcode);
        originalBody.setExitNumber(Short.valueOf(exitNumber));
        //originalBody.setErrorCode(ErrorCode);

        if (original.getPattern().isOutCapable()) {
            original.getOut().setBody(mergeResult);
        } else {
            original.getIn().setBody(mergeResult);
        }
        return original;        
    }
    
}
