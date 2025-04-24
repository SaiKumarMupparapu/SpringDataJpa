package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String> {
	
	@Query("select p.pId from Product p Order by p.pId desc")
	List<String> lastProdId(PageRequest p);
	List<Product> findByPName(String pName);

}
