package com.jpa.modal;

import java.util.ArrayList;
import java.util.List;

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
		
	@Column(name = "Student Mail Id")
	private String stMail;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_fid",referencedColumnName = "stId")
	private List<Address> address = new ArrayList<>();
	
}
