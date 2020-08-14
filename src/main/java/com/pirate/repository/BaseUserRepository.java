package com.pirate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirate.model.entity.user.BaseUser;

public interface BaseUserRepository extends JpaRepository<BaseUser,Long>{

}
