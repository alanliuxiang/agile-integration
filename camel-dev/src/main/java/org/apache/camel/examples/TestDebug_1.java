package org.apache.camel.examples;

import static org.apache.camel.examples.Runner.starter;

public class TestDebug_1 {

	public static void main(String[] args) {

		starter("camelContext-json-array.xml", 1000 * 3);
	}

}
