package admin.adminapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.adminapp.entities.Mutantes;
import admin.adminapp.repository.MutanteRepository;

@Service
public class MutanteService {

	@Autowired
	private MutanteRepository repository;
	
	public Mutantes insetMutanteRegister(Mutantes mutante) {
		return repository.save(mutante);
	}
	
}
