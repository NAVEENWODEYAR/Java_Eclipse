package com.jpa.modal;

import jakarta.persistence.*;
import lombok.*;

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
