package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.modal.Student;
import com.jpa.repo.StudentRepo;

@Service
public class StudentService
{
	// Constructor dependency injection,
	@Autowired
	private StudentRepo studentRepo;
	
	// CRUD 
	//1. INSERT INTO table_name VALUES();
	public Student insertStudent(Student student)
	{
		return studentRepo.save(student);
	}
	
	// 2. Select * from table_name,
	public List<Student> getStudents()
	{
		List<Student> students = studentRepo.findAll();
		return students;
	}
	
	// 3. findByFirstName
	public Student getByName(String faName)
	{
		return studentRepo.findByFaName(faName);
	}
	
	// 4. findByNameContaining
	public List<Student> getByNameContainig(String name)
	{
		return studentRepo.findByFaNameContaining(name);
	}
	
	// 5. findBylNameNotNull
	public List<Student> getBylNameNotNull()
	{
		return studentRepo.findBylNameNotNull();
	}
}
