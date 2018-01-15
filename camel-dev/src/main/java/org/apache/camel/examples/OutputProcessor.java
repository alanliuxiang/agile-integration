package org.apache.camel.examples;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class OutputProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		System.out.println(exchange.getProperties());
		System.out.println(exchange.getIn() + ": " + exchange.getIn().getBody());
		exchange.setOut(exchange.getIn());
		System.out.println(exchange.getOut());
	}

}
