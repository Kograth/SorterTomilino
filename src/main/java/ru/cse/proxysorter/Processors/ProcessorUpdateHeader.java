package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import ru.cse.proxysorter.ConstantsSorter;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Request13;
import ru.cse.proxysorter.Message.Request21;

public class ProcessorUpdateHeader implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {


        Request11 Req11 = exchange.getIn().getBody(Request11.class);
        //Request13 Req13 = exchange.getIn().getBody(Request13.class);
        Request21 Req21 = exchange.getIn().getBody(Request21.class);

        if (!(Req21 == null)) {

            Message in = exchange.getIn();
            in.setHeader(ConstantsSorter.SOURCE_SORTER,"1");

        }

        if (!(Req11 == null)) {


            Message in = exchange.getIn();
            in.setHeader(ConstantsSorter.SOURCE_SORTER,"0");



        }

    }
}
