package com.jpa.modal;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stId;
	private UUID stSSN = UUID.randomUUID();
	private String stName;
	private String stClass;
	private String stAddress;
}
