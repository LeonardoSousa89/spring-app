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

	public List<User> getUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}

	public User insertUser(User user) {
		userRepository.save(user);
		return user;
	}
	
	public void deletetUser(Long id) {
		userRepository.deleteById(id);
	}
	
	private void updateData(User newUser, User user) {
		newUser.setName(user.getName());
		newUser.setEmail(user.getEmail());
	}
	
	public User updatetUser(Long id, User user) {
		User newUser=getUserById(id);
		updateData(newUser, user);
		return userRepository.save(newUser);
	}
}