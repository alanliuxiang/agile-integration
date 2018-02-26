package com.redhat.poc.processor;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;

import com.redhat.poc.maximo.model.Mxpo;

public class DBMappingProcessor extends MappingProcessor {
	
	private static final String ORDER_UNIT = "orderunit";
	private static final String TAX_1 = "tax1";
	private static final String TAX_2 = "tax2";
	private static final String TAX_3 = "tax3";
	private static final String TAX_4 = "tax4";
	private static final String TAX_5 = "tax5";

	@Override
	public void process(Exchange exchange) throws Exception {

		Object obj = getPresMap(exchange);
		if(obj != null) {
			Mxpo mxpo = (Mxpo) obj;
			List<?> list = (List<?>) exchange.getIn().getBody();
			list.forEach(e -> {
				Map<?,?> rowMap = (Map<?, ?>) e;
				mapping(rowMap, mxpo);
			});
		}

		exchange.getIn().setBody(obj);
		exchange.setOut(exchange.getIn());
	}

	private void mapping(Map<?, ?> rowMap, Mxpo mxpo) {
		
		mxpo.getPoline().forEach(p -> {
			if(p.getOrderunit() != null && p.getOrderunit().equals(rowMap.get(ORDER_UNIT))) {
				p.setTax1(Double.valueOf(rowMap.get(TAX_1) + ""));
				p.setTax2(Double.valueOf(rowMap.get(TAX_2) + ""));
				p.setTax3(Double.valueOf(rowMap.get(TAX_3) + ""));
				p.setTax4(Double.valueOf(rowMap.get(TAX_4) + ""));
				p.setTax5(Double.valueOf(rowMap.get(TAX_5) + ""));
			}
		});

	}

	

}
