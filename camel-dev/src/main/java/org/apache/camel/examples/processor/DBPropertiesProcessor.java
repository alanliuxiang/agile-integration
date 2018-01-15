package org.apache.camel.examples.processor;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DBPropertiesProcessor implements Processor {
	
	private static final String RESTTYPE_DESC = "restype_description";
	private static final String CATEGORY_DESC = "category_description";

	@Override
	public void process(Exchange exchange) throws Exception {
		
		try {
			Object restTypeDesc = exchange.getIn().getHeader(RESTTYPE_DESC);
			Object categoryTypeDesc = exchange.getIn().getHeader(CATEGORY_DESC);
			@SuppressWarnings("unchecked")
			Map<String, Object> map = (Map<String, Object>) exchange.getIn().getBody();
			map.put(RESTTYPE_DESC, restTypeDesc);
			Object currentDesc = map.get(CATEGORY_DESC);
			
			String newDesc = categoryTypeDesc + ": " + currentDesc;
			map.put(CATEGORY_DESC, newDesc);
		} catch (Exception e) {
			throw new RuntimeException("External Properties Mapping Exception, " + e.getMessage());
		}
		
		exchange.setOut(exchange.getIn());
		
	}

}
