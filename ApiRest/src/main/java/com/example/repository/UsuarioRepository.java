package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.entity.UsuarioEntity;

/**
 * Repositorio de Usuario.
 * 
 * @author Jesús López Barragán
 *
 */
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	/**
	 * Obtiene un usuario por su nombre.
	 * 
	 * @param nombre Nombre del usuario.
	 * @return UsuarioEntity.
	 */
	UsuarioEntity findByNombre(String nombre);

	/**
	 * Comprueba si el nombre de usuario existe.
	 * 
	 * @param nombre Nombre del usuario.
	 * @return true si el usuario existe, false en caso contrario.
	 */
	Boolean existsByNombre(String nombre);
}
