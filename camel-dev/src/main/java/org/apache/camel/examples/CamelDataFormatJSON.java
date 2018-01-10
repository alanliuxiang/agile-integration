package org.apache.camel.examples;

import static org.apache.camel.examples.Runner.starter;

public class CamelDataFormatJSON {

	public static void main(String[] args) {

		starter("camelContext-json.xml", 1000 * 3);
	}

}
