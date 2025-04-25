package com.example.demo.spec;

import org.springframework.data.jpa.domain.Specification;

import com.example.demo.entity.Product;

import jakarta.persistence.criteria.CriteriaBuilder;

public class ProductSpec {

	public static Specification<Product> nameLike(String name){
		return(root,query,CriteriaBuilder)->
		                  CriteriaBuilder.like(root.get("name"),"%"+name+"%");
	}
	
	public static Specification<Product>priceGreaterThan(double minPrice){
		return(root,query,CriteriaBuilder)->
		                  CriteriaBuilder.greaterThan(root.get("price"), minPrice);
	}
	
	public static Specification<Product>priceLessThan(double maxPrice){
		return (root,query,CriteriaBuilder)->CriteriaBuilder.lessThan(root.get("price"), maxPrice);
	}
	
	public static Specification<Product> greaterThanOrEqual(double min){
		return (root,query,CriteriaBuilder)->CriteriaBuilder.greaterThanOrEqualTo(root.get("price"), min);
	}
}
