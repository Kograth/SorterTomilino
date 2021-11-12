/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Response12;

/**
 *
 * @author Oleynik
 */
public class Req11toResp12 implements Processor {

    @Override
    public void process(Exchange exchng) throws Exception {
        Message In = exchng.getIn();        
        Response12 returnAnswer = new Response12();
        Request11 Req11 = In.getBody(Request11.class);

        short ExitNumber = 1;

        if (Req11.getWeight()>0|Req11.getStateWeight()!=0) {

            ExitNumber = Req11.getExitNumber();
        }
        returnAnswer.setCodeProduct(Req11.getCodePLK());
        returnAnswer.setExitNumber(ExitNumber);
        In.setBody(returnAnswer);
    }
    
}
