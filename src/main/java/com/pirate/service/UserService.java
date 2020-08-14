package com.pirate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.pirate.model.entity.user.BaseUser;
import com.pirate.model.entity.user.UserWithAddress;
import com.pirate.model.entity.user.Username;
import com.pirate.repository.BaseUserRepository;
import com.pirate.repository.UserWithAddressRepository;
import com.pirate.repository.UsernameRepository;

@Service
public class UserService {
	@Autowired
	private BaseUserRepository baseUserRepo;
	
	@Autowired
	private UserWithAddressRepository userWithAddressRepo;
	
	@Autowired
	private UsernameRepository usernameRepo;
	
	public List<BaseUser> getAllBaseUser() {
		List<BaseUser> user = new ArrayList<>();
			
		baseUserRepo.findAll().forEach(user::add);
			 
		return user;
	}
	public List<UserWithAddress> getAllUserWithAddress() {
		List<UserWithAddress> user = new ArrayList<>();
		
		userWithAddressRepo.findAll().forEach(user::add);
			 
		return user;
	}
	public List<Username> getAllUsername() {
		List<Username> user = new ArrayList<>();
		
		usernameRepo.findAll().forEach(user::add);
		
		return user;
	}
}
