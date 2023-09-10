package com.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.modal.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	Student findByFName(String fName);
	List<Student> findByFNameContaining(String fName);
//	List<Student> findBylNameNotnull();
	
}
