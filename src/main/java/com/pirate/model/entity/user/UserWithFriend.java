package com.pirate.model.entity.user;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.pirate.model.map.UserSecret;

@Entity(name="userWithFriend")
@Table(name="users")
public class UserWithFriend extends UserSecret {
	@ManyToMany
	@JoinTable(
	name="friend",
	joinColumns=@JoinColumn(name="user_one_id"),
	inverseJoinColumns=@JoinColumn(name="user_two_id"))
	Set<Username> myFriend1;
	
	@ManyToMany
	@JoinTable(
	name="friend",
	joinColumns=@JoinColumn(name="user_two_id"),
	inverseJoinColumns=@JoinColumn(name="user_one_id"))
	Set<Username> myFriend2;

	//Setters
	public void setMyFriend1(Set<Username> myFriend1) {
		this.myFriend1 = myFriend1;
	}
	public void setMyFriend2(Set<Username> myFriend2) {
		this.myFriend2 = myFriend2;
	}
	//Getters
	public Set<Username> getMyFriend1() {
		return myFriend1;
	}
	public Set<Username> getMyFriend2() {
		return myFriend2;
	}
}
