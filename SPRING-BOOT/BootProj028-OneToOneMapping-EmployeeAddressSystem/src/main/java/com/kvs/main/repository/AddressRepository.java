package com.kvs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvs.main.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
