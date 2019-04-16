package com.goomo;

public class PostConstruct_PreConstruct {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Message :" + message);
		this.message = message;
	}
	public void init()
	{
		System.out.println("Bean is going through init method");
	}
	public void destroy()
	{
		System.out.println("Bean wull be destroyed now");
	}

}
