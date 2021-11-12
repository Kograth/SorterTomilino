package ru.cse.proxysorter.Processors;

//import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
//import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.proxysorter.Message.*;

public class UpdateOpenGate implements AggregationStrategy {

    public Exchange aggregate(Exchange original,Exchange modify) {

        //Создадим класс из данных ТСД
        Request17 Req17 = modify.getIn().getBody(Request17.class);
        Request19 Req19 = modify.getIn().getBody(Request19.class);

        if (!(Req17 == null)) {
            return modify;
        }

        if (!(Req19 == null)) {
            return modify;
        }

        return original;
    }
}
