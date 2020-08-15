package com.pirate.model.entity.address;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import com.pirate.model.entity.user.Username;
import com.pirate.model.map.Address;

@Entity(name="AddressWithUser")
@Table(name="address")
public class AddressWithUser extends Address {
	@ManyToMany
	@JoinTable
	(name="users_address",
	joinColumns=@JoinColumn(name="users_id"),
	inverseJoinColumns=@JoinColumn(name="address_id"))
	Set<Username> myUser;

	//Setters
	public void setMyUser(Set<Username> myUser) {
		this.myUser = myUser;
	}
	//Getters
	public Set<Username> getMyUser() {
		return myUser;
	}
	
}
