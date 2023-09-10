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
@Table(name = "map_Student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Student Id")
	private int stId;
	
	@Column(name = "First Name")
	@NotBlank
	private String fName;
	
	@Column(name = "Last name")
	@NotNull
	private String lName;
	
	@Column(name = "Student Mail Id")
	private String stMail;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private List<Address> address = new ArrayList<>();
	
}
