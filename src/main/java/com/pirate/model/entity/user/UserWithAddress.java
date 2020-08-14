package com.pirate.model.entity.user;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.pirate.model.entity.address.BaseAddress;
import com.pirate.model.map.User;

@Entity(name="userWithAddress")
@Table(name="users")
public class UserWithAddress extends User {
	@ManyToMany
	@JoinTable
	(name="users_address",
	joinColumns=@JoinColumn(name="users_id"),
	inverseJoinColumns=@JoinColumn(name="address_id"))
	Set<BaseAddress> myAddress;

	//Setters
	public void setMyAddress(Set<BaseAddress> myAddress) {
		this.myAddress = myAddress;
	}
	//Getters
	public Set<BaseAddress> getMyAddress() {
		return myAddress;
	}
}
