package com.example.demo.service;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
	
	private  ProductRepo repo;

	@Autowired
	public void setRepo(ProductRepo repo) {
		this.repo = repo;
	}
	
	public  String generateCustomId() {
		String prefix="P";
		int nextNum=1;
		PageRequest limit = PageRequest.of(0, 1);
		List<String> lastProdIds = repo.lastProdId(limit);
		if(!lastProdIds.isEmpty()) {
			String lastId = lastProdIds.get(0);
			String stringId = lastId.substring(prefix.length());
			 nextNum = Integer.parseInt(stringId)+1;
		}
		return prefix+String.format("%03d",nextNum);
	}

	public Product saveProduct() {
		Product p = new Product();
		p.setpName("Mouse");
		p.setpPrice(199.0);
		p.setpId(generateCustomId());
		p.setCreatinDate(LocalDate.now());
		return repo.save(p);
		
	}
	
	public Product updateProduct() {
		List<Product> byPName = repo.findByPName("Mouse");
		Product product = byPName.get(0);
		product.setpPrice(7893.0);
		return repo.save(product);
	}
	
	

}
