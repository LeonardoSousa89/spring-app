package com.UserApp.UserApp.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.UserApp.UserApp.Exceptions.UserException;
import com.UserApp.UserApp.entities.User;
import com.UserApp.UserApp.service.UserService;

@Controller
@RequestMapping(value = "/mutantes")
public class UserResources {

	@Autowired
	UserService userService;

	@ResponseStatus(code = HttpStatus.CREATED, value = HttpStatus.CREATED)
	@PostMapping("/insert")
	public ResponseEntity<User> insertUser(@RequestBody User user) {
	    try {
	        userService.insertUser(user);
	        return ResponseEntity.ok().build();
        }catch (Exception e) {
            throw new UserException("I'm sorry Ocurred an error with server" + e.getMessage());
          }
	    }
	   
	
	 @ResponseStatus(code = HttpStatus.OK, value = HttpStatus.OK)
	 @GetMapping(path = "/all")
	 public ResponseEntity<List<User>> getUser() {
	    List<User> users = userService.getUsers();
	    return ResponseEntity.ok(users);
	  }

}