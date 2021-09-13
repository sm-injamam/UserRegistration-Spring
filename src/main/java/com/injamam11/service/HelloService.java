package com.injamam11.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



//import org.springframework.stereotype.Component;


//@Component //comment out those to create manually bean in WebMvcConfig of 
@Service // HelloService class and use it by @Autowired in HelloController class.
public class HelloService {

	List<String> names =  new ArrayList<>();
	
	public HelloService () {
		names.add("X");
		names.add("Y");
		names.add("Z");
	}
	public List<String> getNames(){
		return this.names;
	}
	public String name() {
		return "Injamam";
	}
}
