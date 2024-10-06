package com.server.record.repo;

import com.server.record.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDAO extends JpaRepository<Address, Integer> {
}
