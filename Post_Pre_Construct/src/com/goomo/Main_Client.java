package com.goomo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Client {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		PostConstruct_PreConstruct ref = (PostConstruct_PreConstruct) context.getBean("post");
		ref.getMessage();
		context.registerShutdownHook();
	}
}
