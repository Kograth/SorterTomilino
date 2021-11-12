package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import ru.cse.proxysorter.Message.Response18;

public class UpdateOpenGateProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

        Message Out = exchange.getOut();
        Out.setBody(new Response18().getClass());

    }
}
