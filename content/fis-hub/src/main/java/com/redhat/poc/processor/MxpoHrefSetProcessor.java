package com.redhat.poc.processor;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MxpoHrefSetProcessor implements Processor {

	@SuppressWarnings("unchecked")
	@Override
	public void process(Exchange exchange) throws Exception {

		Map<String, Object> map = (Map<String, Object>) exchange.getIn().getBody();
		String url = (String) map.get("href");
//		map.put("mxpoURL", url.substring(7) + "?lean=1&_lid=mxintadm&_lpwd=mxintadm");
		map.put("mxpoURL", url.substring(7));
//		exchange.getIn().setHeader("href", map.get("href"));
//		exchange.getIn().setHeader("mxpoURL", map.get("mxpoURL"));
		exchange.getIn().getHeaders().put("href", map.get("href"));
		exchange.getIn().getHeaders().put("mxpoURL", map.get("mxpoURL"));
		exchange.getIn().setBody("");
		exchange.setOut(exchange.getIn());
	}

}
