package com.pirate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pirate.model.entity.user.BaseUser;
import com.pirate.model.entity.user.UserWithAddress;
import com.pirate.model.entity.user.Username;
import com.pirate.service.UserService;

@RestController
public class UserRouter {
	@Autowired
	UserService userServ;
	
	@GetMapping("/user")
	public List<BaseUser> getAllUser() {
		
		return userServ.getAllBaseUser();
	}
	@GetMapping("/user/address") 
	public List<UserWithAddress> getAllUserWithAddress(){
		
		return userServ.getAllUserWithAddress();
	}
	@GetMapping("/username")
	public List<Username> getAllUsername() {
		
		return userServ.getAllUsername();
	}
}
