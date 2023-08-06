package com.swager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.swager.modal.Student;
import com.swager.repo.StudentRepo;

@Service
public class StudentService 
{

	// DI.,
	@Autowired
	private StudentRepo studentRepo;
	
	// CRUD operations.,
	// 1. insert the data into the database.,
	public List<Student> insertStudent(List<Student> st)
	{
		List<Student> st1 = studentRepo.saveAll(st);
		return st1;
	}
	
	// 2. select the data.,
	public List<Student> getStudents()
	{
		return studentRepo.findAll();
	}
	
	// 3. update the student.,
	public Student updateStudent(Student st, Integer stId)
	{
		Student st1 = studentRepo.findById(stId).get();
				st1.setStName(st.getStName());
				st1.setStClass(st.getStClass());
				st1.setStMarks(st.getStMarks());
				
				return studentRepo.save(st1);
	}
	
	// 4. delete the student.,
	public String deleteStudent(Integer stId)
	{
		studentRepo.deleteById(stId);
		return "";
	}
}
