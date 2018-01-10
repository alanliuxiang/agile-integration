package org.apache.camel.examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	@SuppressWarnings({ "static-access", "resource" })
	public static void starter(String camelContext, int sleep){
		
		try {
			new ClassPathXmlApplicationContext("classpath:" + camelContext);
			Thread.currentThread().sleep(sleep);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
