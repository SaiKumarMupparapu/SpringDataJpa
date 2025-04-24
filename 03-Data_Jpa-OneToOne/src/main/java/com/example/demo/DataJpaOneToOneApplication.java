package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.PersonService;

@SpringBootApplication
public class DataJpaOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(DataJpaOneToOneApplication.class, args);
		PersonService personService = 
				context.getBean(PersonService.class);
		personService.savePerson();
		personService.getPersonWithPassport();
		
	}

}
