package com.pirate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirate.model.entity.user.UserWithFriend;

public interface UserWithFriendRepository extends JpaRepository<UserWithFriend,Long>{

	UserWithFriend findByUsername(String username);
}
