package org.apache.camel.examples;

import static org.apache.camel.examples.Runner.starter;

public class CamelSAPIDOC {

	public static void main(String[] args) {

		starter("camelContext-sapidoc.xml", 1000 * 3);
	}

}
