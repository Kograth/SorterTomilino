package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import ru.cse.APILk.Service1c.ReplacingTheBag;
import ru.cse.proxysorter.Message.Request111;
import ru.cse.proxysorter.Message.Request17;

public class Req111To1C implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

        Request111 Req111 = exchange.getIn().getBody(Request111.class);

        String ExitNumber = String.valueOf(Req111.getExitNumber());
        String BagBarCode = String.valueOf(Req111.getBagBarCode());

        ReplacingTheBag ParametersOUT18 = new ReplacingTheBag();

        ParametersOUT18.setBagCode(BagBarCode);
        ParametersOUT18.setExitNumber(ExitNumber);
        ParametersOUT18.setInParametrs("From 111");
        ParametersOUT18.setInLogin("1");
        Message Out = exchange.getOut();
        Out.setBody(ParametersOUT18);
        Out.setHeader(CxfConstants.OPERATION_NAME, "ReplacingTheBag");
        Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client");
    }
}
