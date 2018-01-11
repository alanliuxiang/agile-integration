package org.apache.camel.examples;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.xmljson.XmlJsonDataFormat;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelDataFormatXMLJSONAPI {

	public static void main(String[] args) throws Exception {
		
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new RouteBuilder(){

			@Override
			public void configure() throws Exception {
				
				XmlJsonDataFormat xmlJsonFormat = new XmlJsonDataFormat();
				xmlJsonFormat.setRootName("poline");
				
				from("file:src/input/polines?noop=true")
				.routeId("testRoute")
				.log("${body}")
				.unmarshal(xmlJsonFormat)
				.log("${body}");
			}});
		
		camelContext.start();
		Thread.sleep(3000);
		camelContext.stop();
	}

}
