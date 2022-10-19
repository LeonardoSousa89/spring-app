package admin.adminapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import admin.adminapp.entities.Administrator;
import admin.adminapp.repository.AdminRepository;

@Service
public class AdminServices{
	
	@Autowired
	private AdminRepository repository;
	
	private BCryptPasswordEncoder pass(){
		return new BCryptPasswordEncoder();
	}
	
	public Administrator createAccount(Administrator user) {
		user.setSenha(pass().encode(user.getSenha()));
		return repository.save(user); 
	}
	
	public List<Administrator> getAccount() {
		return repository.findAll();
	}
	
	public Administrator findById(Long id) {
		return repository.findById(id).get();
	}
	
}
