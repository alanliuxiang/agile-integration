package com.redhat.poc.processor;

import org.apache.camel.Exchange;

import com.redhat.poc.maximo.model.Factory;
import com.redhat.poc.maximo.model.Mxpo;

public class PropertiesMappingProcessor extends MappingProcessor {
	
	private static final String RESTTYPE_DESC = "restype_description";
	private static final String CATEGORY_DESC = "category_description";

	@Override
	public void process(Exchange exchange) throws Exception {
		
		try {
			Object restTypeDesc = exchange.getIn().getHeader(RESTTYPE_DESC);
			Object categoryTypeDesc = exchange.getIn().getHeader(CATEGORY_DESC);
			
			Mxpo mxpo = (Mxpo) exchange.getIn().getBody();
			
			if(mxpo != null && mxpo.getPoline() != null && mxpo.getPoline().size() > 0) {
				mxpo.getPoline().forEach(p -> {
					p.setRestypeDescription(restTypeDesc);
					p.setCategoryDescription(categoryTypeDesc + " " + p.getCategoryDescription());
				});
				exchange.setProperty(PROPS_MAPPING, mxpo);
			} else {
				exchange.setProperty(PROPS_MAPPING, Factory.mxpo());
			}
			
			
			exchange.setOut(exchange.getIn());
		} catch (Exception e) {
			throw new RuntimeException("External Properties Mapping Exception, " + e);
		}
		
		
		
		
	}

	

}
