package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmpSErvice;

@SpringBootApplication
public class DataJpaOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				 SpringApplication.run(DataJpaOneToManyApplication.class, args);
		EmpSErvice empSErvice = context.getBean(EmpSErvice.class);
		empSErvice.saveEmp();
	}

}
