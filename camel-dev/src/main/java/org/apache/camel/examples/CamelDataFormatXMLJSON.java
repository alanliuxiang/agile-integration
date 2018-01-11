package org.apache.camel.examples;

import static org.apache.camel.examples.Runner.starter;

public class CamelDataFormatXMLJSON {

	public static void main(String[] args) {

		starter("camelContext-xmljson.xml", 1000 * 3);
	}

}
