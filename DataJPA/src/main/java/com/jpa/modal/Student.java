package com.jpa.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "map_Student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Student Id")
	private int stId;
	
	@Column(name = "Student Name")
	private String stName;
	
	@Column(name = "Student Address")
	private String stAddress;
	
	@Column(name = "Student Mail Id")
	private String stMail;
	
	
}
