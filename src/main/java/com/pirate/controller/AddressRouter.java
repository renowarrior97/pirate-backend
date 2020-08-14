package com.pirate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pirate.model.entity.address.AddressWithUser;
import com.pirate.model.entity.address.BaseAddress;
import com.pirate.service.AddressService;

@RestController
public class AddressRouter {
	@Autowired
	AddressService addressServ;
	
	@GetMapping("/address")
	public List<BaseAddress> getAllAddress() {
		
		return addressServ.getAllBaseAddress();
	}
	@GetMapping("/address/user")
	public List<AddressWithUser> getAllAddressWithUser() {
		
		return addressServ.getAllAddressWithUser();
	}
}
