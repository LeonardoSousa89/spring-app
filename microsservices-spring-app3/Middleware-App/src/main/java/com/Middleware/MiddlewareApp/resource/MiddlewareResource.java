package com.Middleware.MiddlewareApp.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Middleware.MiddlewareApp.entities.MiddlewareHash;
import com.Middleware.MiddlewareApp.service.MiddlewareService;

@RestController
@RequestMapping(value="/hash")
public class MiddlewareResource {

	@Autowired
	private MiddlewareService middlewareService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MiddlewareHash> getUsertHashCode(@PathVariable long id){
		MiddlewareHash code=middlewareService.getUserHash(id);
		return ResponseEntity.ok(code);
	}
}
