package com.goomo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Congiguration_Annotatiom {
	@Bean
	public HelloWorld hello() {
		return new HelloWorld();
			
	}
}
