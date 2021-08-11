package com.example.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.constantes.ConstantesNumericas;
import com.example.model.enums.RolEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad Rol.
 * 
 * @author Jesús López Barragán
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AR_ROL")
public class RolEntity implements Serializable {
	/** Versión de la serialización. */
	private static final long serialVersionUID = 1L;

	/** Identificador. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AR_ROL_ID")
	private Long id;

	/** Código del rol. */
	@Column(name = "AR_ROL_NOMBRE", nullable = false, length = ConstantesNumericas.NUMERO_64)
	private RolEnum nombre;
}
