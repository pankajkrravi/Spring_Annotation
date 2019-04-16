package com.goomo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;
	private String college;

	public Integer getAge() {
		return age;
	}

	@Autowired(required = false)
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	// @Required
	public void setCollege(String college) {
		this.college = college;
	}

}
