package com.demo.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.entities.dummy.PersonDetails;

public interface PersonDetailsRepository extends JpaRepository<PersonDetails, Long> {

}
