package com.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.modal.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	Student findByFaName(String faName);
	List<Student> findByFaNameContaining(String name);
	List<Student> findByLaNameNotNull();
//	Student findByfNameAndlName(String fName, String lName);
	Student findByFName(String fName);
}
