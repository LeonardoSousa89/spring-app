package admin.adminapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.adminapp.entities.Administrator;
import admin.adminapp.repository.AdminRepository;

@Service
public class AdminServices {

	@Autowired
	private AdminRepository repository;
	
	public Administrator createAccount(Administrator user) {
		return repository.save(user);
	}
	
	public List<Administrator> getAccount() {
		return repository.findAll();
	}
	
}
