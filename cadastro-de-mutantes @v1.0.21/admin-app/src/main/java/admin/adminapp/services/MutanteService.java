package admin.adminapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.adminapp.entities.Mutantes;
import admin.adminapp.repository.MutanteRepository;

@Service
public class MutanteService {

	@Autowired
	private MutanteRepository repository;
	
	public Mutantes insertMutanteRegister(Mutantes mutante) {
		return repository.save(mutante);
	}
	
	public List<Mutantes> getMutante() {
		return repository.findAll();
	}
	
	public Mutantes findById(Long id) {
		return repository.findById(id).get();
	}
	
}
