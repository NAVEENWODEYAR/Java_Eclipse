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
	private int addressId;
	
	private String address;

}
