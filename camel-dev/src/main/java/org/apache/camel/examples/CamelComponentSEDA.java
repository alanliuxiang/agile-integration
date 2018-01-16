package org.apache.camel.examples;

import static org.apache.camel.examples.Runner.starter;

public class CamelComponentSEDA {

	public static void main(String[] args) {

		starter("camelContext-seda.xml", 10000);
	}

}
