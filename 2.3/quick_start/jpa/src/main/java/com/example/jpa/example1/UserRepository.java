package com.example.jpa.example1;

import com.example.jpa.example1.customized.CustomizedUserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User>, CustomizedUserRepository {
}
