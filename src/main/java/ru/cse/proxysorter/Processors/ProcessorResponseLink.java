package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import ru.cse.proxysorter.ConstantsSorter;
import ru.cse.proxysorter.Message.Request21;
import ru.cse.proxysorter.Message.Response22;

public class ProcessorResponseLink implements Processor {
    short CommandCode = 0x21;
    Response22 returnAnswer;
    @Override
    public void process(Exchange exchange) throws Exception {

        Message In = exchange.getIn();
       // short Comm1 = (short) exchange.getProperty(ConstantsSorter.PROPERTY_COMANDCODE);
        //ProductCode = (int) exchange.getProperty(ConstantsSorter.PROPERTY_PLK);

        if(CommandCode== Request21.MESSAGE_CODE) {

            Response22 returnAnswer = new Response22();
            short codePLK = In.getBody(Request21.class).getcodePLK();

            returnAnswer.setCodeProduct(codePLK);
            Message Out = exchange.getOut();
            Out.setBody(returnAnswer);
            exchange.setMessage(Out);
        }

    }


    @Override
    public String toString() {
        String NewString = " CommandCode->"+CommandCode+" Response22->"+returnAnswer;
        return super.toString()+NewString;
    }
}
