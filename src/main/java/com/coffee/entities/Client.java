package com.coffee.entities;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CLIENT")
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
	
	@Enumerated(value=EnumType.STRING)
	@Column(name="TYPE_CLIENT")
	private TypeClient TypeClient;
	
	@Column(name = "PHONE")
	private String telefono;
	
//	@ManyToOne(targetEntity=Reservation.class)
//	private List<Reservation> reservations;
	
}
