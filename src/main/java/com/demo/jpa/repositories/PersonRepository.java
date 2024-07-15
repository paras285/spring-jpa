package com.demo.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.entities.dummy.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
