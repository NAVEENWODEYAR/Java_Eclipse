package com.jpa.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "map_Address")
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stId;
	
	private int houseNumber;
	private String houseName;
	private String placeName;
	private String city;
	private String country;
	private double postalCode;
	private double phoneNumber;
}
