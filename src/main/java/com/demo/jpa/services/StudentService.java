package com.demo.jpa.services;

import com.demo.jpa.entities.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public void deleteStudentById(long id);
	public Student findById(Long id);
}
