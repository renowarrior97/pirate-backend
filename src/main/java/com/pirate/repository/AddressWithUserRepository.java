package com.pirate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirate.model.entity.address.AddressWithUser;

public interface AddressWithUserRepository extends JpaRepository<AddressWithUser,Long>{

}
