package com.demo.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>, CustomRepository {

}

