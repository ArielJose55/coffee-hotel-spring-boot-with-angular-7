package com.coffee.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CLIENT_ID", nullable = false)
	private Integer id;
	
	@Column(name = "NUMBER_IDENTIFICATION", nullable = false, unique = true)
	private Integer cedula;
	
	@Column(name = "NAME", nullable = false)
	private String nombre;
	
	@Column(name = "LAST_NAME", nullable = false)
	private String apellido;
	
	@Column(name = "PHONE")
	private String telefono;
}
