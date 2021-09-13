package com.injamam11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.injamam11.service.HelloService;

@Controller
public class HelloController {

	@Autowired 
	private HelloService helloService;
	
	
	@GetMapping({"/hello",""})
	public String hello(Model model) {
		model.addAttribute("name",helloService.name());
		model.addAttribute("names",helloService.getNames());
		return "index";
		
	}
}


