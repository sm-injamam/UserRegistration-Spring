package com.injamam11.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.injamam11.models.User;

@Service
public class UserService {
	
	private List<User> userList = new ArrayList<>();
	
	public List<User> getUsers(){
		return this.userList;
	}
	
	public void addUser(User user) {
		this.userList.add(user);
	}
	
	 

}
