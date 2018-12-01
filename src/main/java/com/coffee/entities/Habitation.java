package com.coffee.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="HABITATION")
public class Habitation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="HABITATION_ID", nullable=false)
	private Integer id;
	
	@Column(name="NUMBER_CODE", nullable=false)
	private String numberCode;
	
	@Column(name="NUMBER_ROON", nullable=false)
	private Integer numberRoon;
	
//	@ManyToOne(targetEntity=Reservation.class)
//	private List<Reservation> reservations;
}
