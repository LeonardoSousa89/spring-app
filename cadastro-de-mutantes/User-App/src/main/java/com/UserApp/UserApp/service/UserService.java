package com.UserApp.UserApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserApp.UserApp.entities.User;
import com.UserApp.UserApp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User insertUser(User user) {
	    userRepository.save(user);
        return user;
	}
	
	public List<User> getUsers() {
          List<User> users=userRepository.findAll();
          return users;
    }
	
}