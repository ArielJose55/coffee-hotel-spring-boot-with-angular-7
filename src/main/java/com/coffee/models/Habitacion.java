package com.coffee.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Habitacion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="HABITATION_ID", nullable=false)
	private Integer id;
	
	@Column(name="NUMBER_CODE", nullable=false)
	private String numberCode;
	
	@Column(name="NUMBER_ROON", nullable=false)
	private Integer numberRoon;
		
}
