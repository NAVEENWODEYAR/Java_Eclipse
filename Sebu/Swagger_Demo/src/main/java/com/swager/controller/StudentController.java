package com.swager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swager.modal.Student;
import com.swager.service.StudentService;

@RestController
@RequestMapping("/swager")
public class StudentController 
{
	// DI.,
	@Autowired
	private StudentService stService;
	
	// REST API's.,
	// 1.post for sending the data.,
	// http://localhost:9876/swager/insertStudents
	@PostMapping("/insertStudents")
	public List<Student> insertStudets(@RequestBody List<Student> st)
	{
		List<Student>st1 = stService.insertStudent(st);
		return st1;
	}
	
	// 2. get for receiving the data.,
	//http://localhost:9876/swager/getStudents
	@GetMapping("/getStudents")
	public List<Student> getStudents()
	{
		return stService.getStudents();
	}
	
	// 3. put for updating the data.,
	//http://localhost:9876/swager/updateStudent/
	@PutMapping("/updateStudent/{stId}")
	public Student updateStudent(@RequestBody Student st, @PathVariable Integer stId)
	{
		return stService.updateStudent(st, stId);
	}
	
	// 4. delete for deleting the record.,
	//http://localhost:9876/swager/deleteStudent/
	@DeleteMapping("/deleteStudent/{stId}")
	public String deleteStudent(@PathVariable Integer stId)
	{
		stService.deleteStudent(stId);
		return "Student with the id,"+stId+" deleted from the database.,";
	}

}
