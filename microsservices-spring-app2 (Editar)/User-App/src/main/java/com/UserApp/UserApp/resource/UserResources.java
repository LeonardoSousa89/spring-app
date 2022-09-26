package com.UserApp.UserApp.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.UserApp.UserApp.entities.User;
import com.UserApp.UserApp.service.UserService;

@Controller
@RequestMapping(value = "/users")
public class UserResources {

	@Autowired
	UserService userService;

	@ResponseStatus(code = HttpStatus.OK, value = HttpStatus.OK)
	@GetMapping(path = "/all")
	public ResponseEntity<List<User>> getUser() {
		List<User> users = userService.getUsers();
		return ResponseEntity.ok(users);
	}

	@ResponseStatus(code = HttpStatus.OK, value = HttpStatus.OK)
	@GetMapping(path = "/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		User user=userService.getUserById(id);
		return ResponseEntity.ok(user);
	}

	@ResponseStatus(code = HttpStatus.CREATED, value = HttpStatus.CREATED)
	@PostMapping("/insert")
	public ResponseEntity<User> insertUser(@RequestBody User user) {
		userService.insertUser(user);
		return ResponseEntity.ok().build();
	}

	@ResponseStatus(code = HttpStatus.NO_CONTENT, value = HttpStatus.NO_CONTENT)
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deletertUser(@PathVariable Long id) {
		userService.deletetUser(id);
		return ResponseEntity.noContent().build();
	}
	
	@ResponseStatus(code = HttpStatus.CREATED, value = HttpStatus.CREATED)
	@PutMapping("/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User user) {
		userService.updatetUser(id, user);
		return ResponseEntity.ok().build();
	}

}