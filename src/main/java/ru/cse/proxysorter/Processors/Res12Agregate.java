package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.proxysorter.Message.Request11;

public class Res12Agregate implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        Request11 originalBody = oldExchange.getIn().getBody(Request11.class);

        newExchange = oldExchange;
        return newExchange;
    }
}
