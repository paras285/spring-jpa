package com.demo.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
