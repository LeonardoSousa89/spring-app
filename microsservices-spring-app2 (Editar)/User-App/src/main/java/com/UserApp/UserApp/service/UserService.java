package com.UserApp.UserApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserApp.UserApp.Exceptions.UserException;
import com.UserApp.UserApp.entities.User;
import com.UserApp.UserApp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> getUsers() {
		try {
			List<User> users = userRepository.findAll();
			return users;
		}catch (Exception e) {
			throw new UserException("I'm sorry Ocurred an error" + e.getMessage());
		}
	}

	public User getUserById(Long id) {
		try {
			return userRepository.findById(id).get();
		}catch (Exception e) {
			throw new UserException("I'm sorry Ocurred an error" + e.getMessage());
		}
	}

	public User insertUser(User user) {
		try {
			userRepository.save(user);
			return user;
		}catch (Exception e) {
			throw new UserException("I'm sorry Ocurred an error" + e.getMessage());
		}
	}
	
	public void deletetUser(Long id) {
		try {
			userRepository.deleteById(id);
		}catch (Exception e) {
			throw new UserException("I'm sorry Ocurred an error" + e.getMessage());
		}
	}
	
	private void updateData(User newUser, User user) {
		try {
			newUser.setName(user.getName());
			newUser.setEmail(user.getEmail());
		}catch (Exception e) {
			throw new UserException("I'm sorry Ocurred an error" + e.getMessage());
		}
	}
	
	public User updatetUser(Long id, User user) {
		try {
			User newUser=getUserById(id);
			updateData(newUser, user);
			return userRepository.save(newUser);
		}catch (Exception e) {
			throw new UserException("I'm sorry Ocurred an error" + e.getMessage());
		}
	}
}