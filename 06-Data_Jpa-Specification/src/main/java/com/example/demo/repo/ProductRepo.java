package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	List<Product> findAll(Specification<Product> spec);

}
