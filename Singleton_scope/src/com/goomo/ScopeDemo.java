package com.goomo;

public class ScopeDemo {
	private String meessage;

	public String getMeessage() {
		System.out.println("Message :"+meessage);
		return meessage;
	}

	public void setMeessage(String meessage) {
		this.meessage = meessage;
	}

}
