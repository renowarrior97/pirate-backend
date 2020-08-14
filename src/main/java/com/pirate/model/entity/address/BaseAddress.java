package com.pirate.model.entity.address;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pirate.model.entity.user.UserWithAddress;
import com.pirate.model.map.Address;

@Entity(name="Address")
@Table(name="address")
public class BaseAddress extends Address{
	@ManyToMany(mappedBy="myAddress")
	@JsonIgnore
	Set<UserWithAddress> refUser;

	//Setters
	public void setRefUser(Set<UserWithAddress> refUser) {
		this.refUser = refUser;
	}
	//Getters
	public Set<UserWithAddress> getRefUser() {
		return refUser;
	}
}
