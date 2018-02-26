package com.redhat.poc.processor;

import java.util.Map;

import org.apache.camel.Exchange;

public class SetPropertiesProcessor extends MappingProcessor {

	@Override
	public void process(Exchange exchange) throws Exception {

		@SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>) exchange.getIn().getBody();
		exchange.setProperty(PROPS_MAPPING, clone(map));
        exchange.setOut(exchange.getIn());
	}

}
