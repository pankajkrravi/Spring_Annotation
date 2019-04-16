package com.goomo.Client;

import com.goomo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Student bean = (Student) context.getBean("student");
		System.out.println(bean.getAge());
		System.out.println(bean.getName());
		System.out.println(bean.getCollege());

	}

}
