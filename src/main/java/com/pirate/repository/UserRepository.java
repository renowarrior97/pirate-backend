package com.pirate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirate.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
