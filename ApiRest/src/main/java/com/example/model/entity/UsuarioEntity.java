package com.example.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.constantes.ConstantesNumericas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad de Usuario.
 * 
 * @author Jesús López Barragán
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AR_USUARIO")
public class UsuarioEntity implements Serializable {
	/** Versión de la serialización. */
	private static final long serialVersionUID = 1L;

	/** Identificador. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AR_USUARIO_ID")
	private Long id;

	/** Nombre del usuario. */
	@Column(name = "AR_USUARIO_NOMBRE", nullable = false, length = ConstantesNumericas.NUMERO_64)
	private String nombre;

	/** Clave del usuario. */
	@Column(name = "AR_USUARIO_CLAVE", nullable = false, length = ConstantesNumericas.NUMERO_128)
	private String clave;
}
