package admin.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import admin.adminapp.entities.Administrator;

public interface AdminRepository extends JpaRepository<Administrator, Long>{

}
