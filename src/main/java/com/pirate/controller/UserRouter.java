package com.pirate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pirate.model.User;
import com.pirate.service.UserService;

@RestController
public class UserRouter {
	@Autowired
	UserService userServ;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		
		return userServ.getAllUsers();
	}
}
