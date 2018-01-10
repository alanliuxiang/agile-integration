package org.apache.camel.examples;

import static org.apache.camel.examples.Runner.starter;

public class CamelComponentHTTP {

	public static void main(String[] args) {

		starter("camelContext-http.xml", 10000 * 3);
		
		starter("camelContext-http-basic.xml", 10000 * 3);
	}

}
