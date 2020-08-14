package com.pirate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirate.model.entity.user.UserWithAddress;

public interface UserWithAddressRepository extends JpaRepository<UserWithAddress,Long>{

}
