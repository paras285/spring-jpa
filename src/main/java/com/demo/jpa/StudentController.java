package com.demo.jpa;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpa.entities.Student;
import com.demo.jpa.services.StudentService;

@RestController
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@PostMapping("students")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@DeleteMapping("students/{studentId}")
	public void deleteStudentById(@PathVariable Long studentId) {
		studentService.deleteStudentById(studentId);
	}

	@GetMapping("students")
	public Student getStudentById(@RequestParam Long id) {
		return studentService.findById(id);
	}

	// Put Mapping is used if we want to update/replace the resource entirely

	@PutMapping("students/{id}")
	public Student updateStudent(@PathVariable long id, @RequestBody Student student) {
		return null;
	}

	// Patch Mapping is used if we want to update some part of resource
	@PatchMapping("student/{id}")
	public Student updateStudent_Patch(@PathVariable long id, @RequestBody Student student) {
		return null;
	}
}
