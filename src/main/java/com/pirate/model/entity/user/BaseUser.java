package com.pirate.model.entity.user;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pirate.model.entity.address.AddressWithUser;
import com.pirate.model.map.User;

@Entity(name="User")
@Table(name="users")
public class BaseUser extends User {
	@ManyToMany(mappedBy="myUser")
	@JsonIgnore
	Set<AddressWithUser> refAddress;

	//Setters
	public void setRefAddress(Set<AddressWithUser> refAddress) {
		this.refAddress = refAddress;
	}

	//Getters
	public Set<AddressWithUser> getRefAddress() {
		return refAddress;
	}
}
