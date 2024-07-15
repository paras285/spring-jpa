package com.demo.jpa.services;

import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.demo.jpa.entities.Course;
import com.demo.jpa.entities.Student;
import com.demo.jpa.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudentById(long id) {
		studentRepository.deleteById(id);
	}

	@Override
	@Transactional
	public Student findById(Long id) {
		Student student = studentRepository.findStudentsWithCourse(id);
		System.out.println(student);
		Set<Course> studentCourses = student.getCourse();
		return student;
//		Optional<Student> optionalStudent = studentRepository.findById(id);
//		Student student = optionalStudent.orElseThrow(() -> new RuntimeException("Student Not Found"));
//		Set<Course> studentCourses = student.getCourse();
//		return student;
	}
}

//		Course course = new Course();
//		course.setName("Course 2");
//		studentCourses.add(course);
//		//student.getCourse().stream().forEach(course -> course.setName("Updated Course"));