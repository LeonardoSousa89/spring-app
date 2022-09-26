package com.UserApp.UserApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.UserApp.UserApp.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{}
