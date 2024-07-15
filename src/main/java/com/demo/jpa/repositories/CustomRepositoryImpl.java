package com.demo.jpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.jpa.entities.Student;

@Repository
public class CustomRepositoryImpl implements CustomRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	public Student findStudentsWithCourse(Long id) {
		String queryString = "SELECT student FROM Student student JOIN FETCH student.course where student.id = :id";
		TypedQuery<Student> query = entityManager.createQuery(queryString, Student.class);
		query.setParameter("id", id);
		return query.getSingleResult();
	}
}
