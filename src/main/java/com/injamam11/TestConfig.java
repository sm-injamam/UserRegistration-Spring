package com.injamam11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.injamam11.service.HelloService;
@Configuration
public class TestConfig {
	
	@Bean 
	public HelloService helloService() {
		return new HelloService();
	}

}
