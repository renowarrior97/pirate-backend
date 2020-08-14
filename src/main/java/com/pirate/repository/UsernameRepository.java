package com.pirate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirate.model.entity.user.Username;

public interface UsernameRepository extends JpaRepository<Username,Long>{

}
