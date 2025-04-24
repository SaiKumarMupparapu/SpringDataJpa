package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonPks;

public interface PersonRepo extends JpaRepository<Person, PersonPks> {

	
}
