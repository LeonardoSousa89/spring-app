package admin.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import admin.adminapp.entities.Administrator;

@Repository
public interface AdminRepository extends JpaRepository<Administrator, Long>{
	
}
