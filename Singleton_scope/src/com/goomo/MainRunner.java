package com.goomo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		ScopeDemo scopeDemo = (ScopeDemo) context.getBean("ref");
		scopeDemo.setMeessage("Hi all of yoy !!");
		scopeDemo.getMeessage();
		ScopeDemo scopeDemo2 = (ScopeDemo) context.getBean("ref");
		scopeDemo2.getMeessage();
	}

}
