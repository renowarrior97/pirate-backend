package com.pirate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.pirate.model.User;
import com.pirate.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
			
		userRepo.findAll().forEach(users::add);
			 
		return users;
	}
}
