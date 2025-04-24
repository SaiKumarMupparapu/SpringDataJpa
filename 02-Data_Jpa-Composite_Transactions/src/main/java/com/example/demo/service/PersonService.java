package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonPks;
import com.example.demo.repo.PersonRepo;

@Service
public class PersonService {
	
	private PersonRepo repo;

	@Autowired
	public PersonRepo setRepo(PersonRepo repo) {
		return this.repo=repo;
	}
	
	public void savePerson() {
		
		PersonPks pk=new PersonPks();
		pk.setpId(2);
		pk.setPassport("def100xyz1");
		
		Person p=new Person();
		p.setName("Nagamani");
		p.setAge(53);
		p.setCountry("India");		
		p.setPks(pk);		
		repo.save(p);
		System.out.println(p);
		
	}
	
	public void getPerson() {
		PersonPks pk=new PersonPks();
//		pk.setPassport("abc100xyz0");
		pk.setpId(2);
		Optional<Person> byId = repo.findById(pk);
		if(byId.isPresent()) {
			System.out.println(byId);
		}
	}
	
	

}
