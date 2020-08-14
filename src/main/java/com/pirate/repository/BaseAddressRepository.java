package com.pirate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirate.model.entity.address.BaseAddress;

public interface BaseAddressRepository extends JpaRepository<BaseAddress,Long>{

}
