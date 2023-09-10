package com.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.modal.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	Student findByfName(String fName);
	List<Student> findByfNameContaining(String name);
	List<Student> findBylNamenotNull();
//	Student findByfNameAndLName(String fName, String lName);
	
}
