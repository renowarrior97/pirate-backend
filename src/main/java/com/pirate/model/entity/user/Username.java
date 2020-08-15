package com.pirate.model.entity.user;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pirate.model.entity.address.AddressWithUser;
import com.pirate.model.map.UserSecret;

@Entity(name="username")
@Table(name="users")
public class Username extends UserSecret {
	@ManyToMany(mappedBy="myUser")
	@JsonIgnore
	Set<AddressWithUser> refAddress;
	
	@ManyToMany(mappedBy="myFriend1")
	@JsonIgnore
	Set<UserWithFriend> refUser1;
	
	@ManyToMany(mappedBy="myFriend2")
	@JsonIgnore
	Set<UserWithFriend> refUser2;

	//Setters
	public void setRefAddress(Set<AddressWithUser> refAddress) {
		this.refAddress = refAddress;
	}
	public void setRefUser1(Set<UserWithFriend> refUser1) {
		this.refUser1 = refUser1;
	}
	public void setRefUser2(Set<UserWithFriend> refUser2) {
		this.refUser2 = refUser2;
	}
	//Getters
	public Set<AddressWithUser> getRefAddress() {
		return refAddress;
	}
	public Set<UserWithFriend> getRefUser1() {
		return refUser1;
	}
	public Set<UserWithFriend> getRefUser2() {
		return refUser2;
	}
}
