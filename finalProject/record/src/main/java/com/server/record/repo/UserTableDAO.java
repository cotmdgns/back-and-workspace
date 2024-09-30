package com.server.record.repo;

import com.server.record.domain.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTableDAO extends JpaRepository<UserTable,Integer> {
}
