package com.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.modal.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	List<Student> findByFirstName(String fName);
	List<Student> findByFirstNameContaining(String fName);
	List<Student> findByLastNameNotnull();
	
}
