package admin.adminapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import admin.adminapp.entities.Administrator;
import admin.adminapp.services.AdminServices;

@RestController
@RequestMapping(value = "/registro")
public class AdminController {
	
	@Autowired
	AdminServices service;
	
	@PostMapping(value = "/cadastro")
	public ResponseEntity<Administrator> createAccount(@RequestBody Administrator user) {
		Administrator account=service.createAccount(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(account);
	}
	
	@GetMapping(value = "/all/conta/registro-de-mutantes")
	public ResponseEntity<List<Administrator>> getAccount() {
		List <Administrator> registros=service.getAccount();
		return ResponseEntity.status(HttpStatus.OK).body(registros);
	}
}
