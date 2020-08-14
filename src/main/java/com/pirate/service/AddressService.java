package com.pirate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.pirate.repository.BaseAddressRepository;
import com.pirate.model.entity.address.AddressWithUser;
import com.pirate.model.entity.address.BaseAddress;
import com.pirate.repository.AddressWithUserRepository;

@Service
public class AddressService {
	@Autowired
	private BaseAddressRepository baseAddressRepo;
	
	@Autowired
	private AddressWithUserRepository addressWithUserRepo;
	
	public List<BaseAddress> getAllBaseAddress() {
		List<BaseAddress> address = new ArrayList<>();
			
		baseAddressRepo.findAll().forEach(address::add);
			 
		return address;
	}
	public List<AddressWithUser> getAllAddressWithUser() {
		List<AddressWithUser> address=new ArrayList<>();
		
		addressWithUserRepo.findAll().forEach(address::add);
		
		return address;
	}
}
