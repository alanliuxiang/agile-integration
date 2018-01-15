package org.apache.camel.examples.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DBPropertiesProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		System.out.println(exchange);
		
		exchange.setOut(exchange.getIn());
		
	}

}
