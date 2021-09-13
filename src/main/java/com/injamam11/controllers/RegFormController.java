package com.injamam11.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.injamam11.models.User;
import com.injamam11.service.UserService;
//import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/users")
public class RegFormController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/add")
	public String addName_Get(Model model) {
		model.addAttribute("user", new User());
		
		List<String> districtList =Arrays.asList("Dhaka","Gazipur","Khulna","Rajshahi","Barishal","Rangpur","COX","Comilla");
		model.addAttribute("districtList",districtList);
		return "userForm";
	}
	
	@PostMapping("/add")
	public String addUser_post(Model model,@ModelAttribute User user) {
		userService.addUser(user);
		return "redirect:/users/all";
		
	}
	
	@GetMapping("/all")
	public String showAll(Model model) {
		model.addAttribute("users",userService.getUsers());
		return "showUsers";
	}
	

}
