package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.entity.RolEntity;
import com.example.model.enums.RolEnum;

/**
 * Repositorio de Rol.
 * 
 * @author Jesús López Barragán
 *
 */
public interface RolRepository extends JpaRepository<RolEntity, Long> {
	/**
	 * Obtiene un rol por su nombre.
	 * 
	 * @param nombre Nombre del rol.
	 * @return RolEntity.
	 */
	RolEntity findByNombre(RolEnum nombre);
}
