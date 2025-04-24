package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmpService {

	private EmployeeRepository repo;

	public EmpService(EmployeeRepository repo) {
		this.repo = repo;
	}

	public void saveEmp(Employee emp) {
		Employee savedEmp = repo.save(emp);
		if (savedEmp.getName() != null)
			System.out.println("Employee saved");
		else
			System.out.println("Employee not saved");
	}
	public void saveAllEmp(List<Employee> emp) {
		List<Employee> savedAll = repo.saveAll(emp);
		System.out.println("all employees are saved");
	}
	public void getAllEmp() {
		repo.findAll().forEach(e->System.out.println(e));
	}
	public void getEmpBySort() {
		// if we don't know the number of parameters use variable argument
		//like m1(int...)
//		Sort sort = Sort.by("salary").descending();
		Sort sort = Sort.by("name","salary").ascending();
		
		repo.findAll(sort).forEach(e->System.out.println(e));
	}
	
	public void getEmpByPage() {
		int pageSize=5;
		int pageNumber=2;
		PageRequest pr = PageRequest.of(pageNumber-1, pageSize);
		Page<Employee> page = repo.findAll(pr);
		List<Employee> list = page.getContent();
		list.forEach((e)->System.out.println(e));
	}

	public void getEmpByFilter() {
		Employee entity= new Employee();
//		entity.setEmail("123@email");
		Example<Employee> example = Example.of(entity);
		List<Employee> all = repo.findAll(example);
		all.forEach(emp->System.out.println(emp));
	}

}
