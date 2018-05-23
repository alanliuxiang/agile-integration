package org.jboss.fuse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) throws InterruptedException {
		
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/camel-context.xml");
		Thread.currentThread().sleep(1000 * 5);

	}
}
