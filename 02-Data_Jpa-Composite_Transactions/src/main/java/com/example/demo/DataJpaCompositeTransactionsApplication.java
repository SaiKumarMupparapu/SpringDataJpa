package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmpService;
import com.example.demo.service.PersonService;

@SpringBootApplication
public class DataJpaCompositeTransactionsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(DataJpaCompositeTransactionsApplication.class, args);
//		PersonService service = 
//				context.getBean(PersonService.class);
//		service.savePerson();
//		service.getPerson();
		
		EmpService bean = context.getBean(EmpService.class);
		bean.saveEmpWithAdrs();
		
	}

}
