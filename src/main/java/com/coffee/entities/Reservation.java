package com.coffee.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="RESERVATION")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RESERVATION_ID", nullable=false)
	private Integer id;
	
	@Column(name="DATE_START")
	private java.sql.Date startDate;
	
	@Column(name="DATE_END")
	private java.sql.Date endDate;
	
	@Column(name="PRICE_PER_DAY")
	private Double pricePerDay;
	
}
