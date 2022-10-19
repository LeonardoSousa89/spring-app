package admin.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import admin.adminapp.entities.Mutantes;

@Repository
public interface MutanteRepository extends JpaRepository<Mutantes, Long>{

}
