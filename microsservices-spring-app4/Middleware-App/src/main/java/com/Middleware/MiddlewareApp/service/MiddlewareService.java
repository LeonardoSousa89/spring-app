package com.Middleware.MiddlewareApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Middleware.MiddlewareApp.entities.MiddlewareHash;
import com.Middleware.MiddlewareApp.entities.User;
import com.Middleware.MiddlewareApp.methods.UserFeignClient;

@Service
public class MiddlewareService {
	
	@Autowired
	private UserFeignClient userFeignClient;

	public MiddlewareHash getUserHash(long id) {
		MiddlewareHash code = new MiddlewareHash();
		User user=userFeignClient.findById(id).getBody();
		return new MiddlewareHash(user.getId(), user.getName(), user.getEmail(), code.getHash());	
	}
}
