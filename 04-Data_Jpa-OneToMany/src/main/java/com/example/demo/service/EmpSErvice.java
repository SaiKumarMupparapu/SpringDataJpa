package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.repo.AdrsRepo;
import com.example.demo.repo.EmpRepo;

@Service
public class EmpSErvice {
	@Autowired
	private EmpRepo eRepo;
	@Autowired
	private AdrsRepo aRepo;

	public void saveEmp() {
		Employee e = new Employee();
		e.setName("Kumar");
		Address a1=new Address();
		a1.setCity("khammam");
		a1.setState("tg");
		a1.setCountery("IND");
		a1.setAdrsType("present");
		
		Address a2=new Address();
		a2.setCity("khammam");
		a2.setState("tg");
		a2.setCountery("IND");
		a2.setAdrsType("permanent");
		//association mapping
		a1.setEmp(e);
		a2.setEmp(e);
		
		e.setAdrs(Arrays.asList(a1,a2));
		
		eRepo.save(e);
		System.err.println("saved");

	}

}
