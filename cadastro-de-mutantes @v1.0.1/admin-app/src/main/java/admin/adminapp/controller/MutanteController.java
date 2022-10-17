package admin.adminapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import admin.adminapp.entities.Mutantes;
import admin.adminapp.services.MutanteService;

@RestController
@RequestMapping(value = "/registro")
public class MutanteController {
	
	@Autowired
	private MutanteService service;
	
	@PostMapping(value = "/{id}/registro-de-mutantes")
	public ResponseEntity<Mutantes> createAccount(@PathVariable Long id, @RequestBody Mutantes mutante) {
			Mutantes registered=service.insetMutanteRegister(mutante);
			return ResponseEntity.status(HttpStatus.CREATED).body(registered);
	}
	
	@GetMapping(value = "/all/mutantes/registro-de-mutantes")
	public ResponseEntity<List<Mutantes>> getMutantes() {
		List<Mutantes> mutantes=service.getMutante();
		return ResponseEntity.status(HttpStatus.OK).body(mutantes);
	}
	
}
