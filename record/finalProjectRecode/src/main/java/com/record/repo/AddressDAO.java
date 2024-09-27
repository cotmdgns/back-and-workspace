package com.record.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.record.domain.Address;

public interface AddressDAO extends JpaRepository<Address, Integer>{

}
