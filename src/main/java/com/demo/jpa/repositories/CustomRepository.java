package com.demo.jpa.repositories;

import com.demo.jpa.entities.Student;

public interface CustomRepository {

	public Student findStudentsWithCourse(Long id);
}


