package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.repo.AdrsRepo;
import com.example.demo.repo.EmpRepo;

import jakarta.transaction.Transactional;

@Service
public class EmpService {

	private EmpRepo eRepo;
	private AdrsRepo aRepo;

	@Autowired
	public EmpService(EmpRepo eRepo, AdrsRepo aRepo) {
		this.eRepo = eRepo;
		this.aRepo = aRepo;
	}

	@Transactional(rollbackOn = Exception.class)
	public void saveEmpWithAdrs() {
		Employee e = new Employee();
		e.setName("Nagamani");

		Employee save = eRepo.save(e);
		System.out.println(save);

		Address a = new Address();
		a.setCity("Kondapalli");
		a.setState("TG");
		a.setCountery("IND");
		a.seteId(save.getId());
		Address save2 = aRepo.save(a);
		System.out.println(save2);
	}


}
