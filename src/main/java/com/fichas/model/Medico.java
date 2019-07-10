package com.fichas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="medico")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMedico;
	
	@Column(name="nombres",nullable = false,length = 70)
	private String nombres;
	
	@Column(name="apellidos",nullable = false,length = 70)
	private String apellidos;
	
	@Column(name="licenciamedica",nullable = false,length = 12)
	private String licenciamedica;
	
	
	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getLicenciamedica() {
		return licenciamedica;
	}

	public void setLicenciamedica(String licenciamedica) {
		this.licenciamedica = licenciamedica;
	}

}
