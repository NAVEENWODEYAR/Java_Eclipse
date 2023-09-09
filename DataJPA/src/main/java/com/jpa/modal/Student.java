package com.jpa.modal;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_fid",referencedColumnName = "addressId")
	private List<Address> address = new ArrayList<>();
	
}
