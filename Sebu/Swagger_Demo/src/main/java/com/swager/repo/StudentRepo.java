package com.swager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swager.modal.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{

}
