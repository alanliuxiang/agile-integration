package org.apache.camel.examples;

import static org.apache.camel.examples.Runner.starter;

public class CamelComponentActiveMQ {

	public static void main(String[] args) {

		starter("camelContext-activemq.xml", 10000);
	}

}
