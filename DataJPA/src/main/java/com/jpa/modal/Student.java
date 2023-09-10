package com.jpa.modal;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "map_Student",uniqueConstraints = @UniqueConstraint(columnNames = "Student Mail Id"))
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Student Id")
	private int stId;
	
	@Column(name = "First Name",nullable = false)
	private String faName;
	
	@Column(name = "Last name",nullable = false)
	private String laName;
	
	@Column(name = "Student Mail Id",nullable = false)
	private String stMail;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private List<Address> address = new ArrayList<>();
		
}
