package org.apache.camel.examples;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class MyRouteBuilder {
	
	public static void main(String[] arvs) throws Exception {
		
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new RouteBuilder(){

			@Override
			public void configure() throws Exception {
				from("file:src/data?noop=true").to("file:target/messages");
			}});
		
		camelContext.start();
		Thread.sleep(3000);
		camelContext.stop();
		
		System.out.println("DONE");
	}

}
