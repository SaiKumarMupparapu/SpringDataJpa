package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(DataJpaApplication.class, args);
//		EmpService bean = context.getBean(EmpService.class);
//		Employee e1=new Employee();
//		e1.setName("SAI");
//		e1.setEmail("123@email");
//		e1.setSalary(12345.5);
//		Employee e2=new Employee();
//		e2.setName("Kumar");
//		e2.setEmail("kumar@email");
//		e2.setSalary(78945.9);
//		Employee e3=new Employee();
//		e3.setName("janakiran");
//		e3.setEmail("janakiran@email");
//		e3.setSalary(12345.5);
//		List<Employee> asList = Arrays.asList(e1,e2,e3);
//		
//		Employee e=new Employee();
//		e.setName("Shiva");
//		e.setEmail("123@email");
//		e.setSalary(12345.5);
		
//		bean.saveEmp(e);
//		bean.saveAllEmp(asList);
//		bean.getAllEmp();
//		bean.getEmpBySort();
//		bean.getEmpByPage();
//		bean.getEmpByFilter();
		
		ProductService productService = 
				          context.getBean(ProductService.class);
		
//		productService.saveProduct();
		productService.updateProduct();
		
	}

}
