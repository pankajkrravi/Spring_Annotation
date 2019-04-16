package com.goomo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		TextEditor t = (TextEditor) context.getBean("texteditor");
		t.spellCheck();
	}
}
