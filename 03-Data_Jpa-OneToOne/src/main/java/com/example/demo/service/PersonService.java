package com.example.demo.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passport;
import com.example.demo.entity.Person;
import com.example.demo.repo.PassportRepo;
import com.example.demo.repo.PersonRepo;

@Service
public class PersonService {

	private PersonRepo pRepo;
	private PassportRepo ppRepo;

	@Autowired
	public PersonService(PersonRepo pRepo, PassportRepo ppRepo) {
		this.pRepo = pRepo;
		this.ppRepo = ppRepo;
	}

	public void savePerson() {
		Person p = new Person();
		p.setName("Nagamani");

		Passport pp = new Passport();
		pp.setPpNum("DEF456UVW");
		pp.setIssuedDate(LocalDate.now().minusYears(5));
		pp.setExpdDate(LocalDate.now().plusYears(20));
		// association mapping
		pp.setPerson(p);
		// association mapping
		p.setPassport(pp);

		pRepo.save(p);

	}

	public void getPersonWithPassport() {
		Optional<Person> optional = pRepo.findById(1);
		if (optional.isPresent()) {
			Person person = optional.get();
			System.out.print("Id : "+person.getpId()+" Name : "+person.getName());

			Passport passport = person.getPassport();
			System.out.print("\t ppNum : "+passport.getPpNum()+" issuedDte : "+passport.getIssuedDate()+" Exp Date : "+passport.getExpdDate());
			

		}
	}

}
