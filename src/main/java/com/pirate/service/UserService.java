package com.pirate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.pirate.model.entity.user.BaseUser;
import com.pirate.model.entity.user.UserWithAddress;
import com.pirate.model.entity.user.UserWithFriend;
import com.pirate.model.entity.user.Username;
import com.pirate.repository.BaseUserRepository;
import com.pirate.repository.UserWithAddressRepository;
import com.pirate.repository.UserWithFriendRepository;
import com.pirate.repository.UsernameRepository;

@Service
public class UserService {
	@Autowired
	private BaseUserRepository baseUserRepo;

	@Autowired
	private UserWithAddressRepository userWithAddressRepo;
	
	@Autowired
	private UsernameRepository usernameRepo;
	
	@Autowired
	private UserWithFriendRepository userWithFriendRepo;
	
	//Service gets all user info
	public List<BaseUser> getAllBaseUser() {
		List<BaseUser> user = new ArrayList<>();
			
		baseUserRepo.findAll().forEach(user::add);
			 
		return user;
	}
	//Service gets user info and their address info
	public List<UserWithAddress> getAllUserWithAddress() {
		List<UserWithAddress> user = new ArrayList<>();
		
		userWithAddressRepo.findAll().forEach(user::add);
			 
		return user;
	}
	//Service gets all usernames
	public List<Username> getAllUsername() {
		List<Username> user = new ArrayList<>();
		
		usernameRepo.findAll().forEach(user::add);
		
		return user;
	}
	//Service gets all users and two lists that are collective friends
	public  UserWithFriend getUserWithFriendByUsername(String username) {
		return userWithFriendRepo.findByUsername(username);
	}
}
