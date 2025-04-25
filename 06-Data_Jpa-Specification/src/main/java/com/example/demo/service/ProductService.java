package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.spec.ProductSpec;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;
	
	//save products
	public void saveProduct() {
		//computers
		Product p1= new Product();
		p1.setCategory("Computers");
		p1.setName("Keyboard");
		p1.setPrice(599.0);
		
		Product p2= new Product();
		p2.setCategory("computers");
		p2.setName("Mouse");
		p2.setPrice(999.0);
		Product p3= new Product();
		p3.setCategory("computers");
		p3.setName("RAm");
		p3.setPrice(1999.0);
		Product p4= new Product();
		p4.setCategory("computers");
		p4.setName("MOniter");
		p4.setPrice(2999.0);
		Product p5= new Product();
		p5.setCategory("computers");
		p5.setName("CPU");
		p5.setPrice(3999.0);
		
		// mobiles
		
		Product p6= new Product();
		p6.setCategory("Mobiles");
		p6.setName("Apple");
		p6.setPrice(99999.0);
		
		Product p7= new Product();
		p7.setCategory("Mobiles");
		p7.setName("RealMe");
		p7.setPrice(19990.0);
		
		Product p8= new Product();
		p8.setCategory("Mobiles");
		p8.setName("Mi");
		p8.setPrice(20999.0);
		
		Product p9= new Product();
		p9.setCategory("Mobiles");
		p9.setName("samsung");
		p9.setPrice(30999.0);
		
		repo.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9));
		
	}
	
	//get product by specifications
	public void getProductBySpec(String name,Double minPrice,Double maxPrice, Double minGE) {
		Specification<Product> spec = Specification.where(null);
		
		if(name!=null) {
			 spec = spec.and(ProductSpec.nameLike(name));
		}if(minPrice != null) {
				spec=spec.or(ProductSpec.priceGreaterThan(minPrice));				
				
		}
		if(maxPrice!= null) {
			spec=spec.and(ProductSpec.priceLessThan(maxPrice));
		}
		if(minGE != null) {
			spec=spec.and(ProductSpec.greaterThanOrEqual(minGE));
		}
		
		List<Product> all = repo.findAll(spec);
		all.stream().forEach(System.out::println);
		
	}
}
