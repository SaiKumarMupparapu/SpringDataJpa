package com.example.demo.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Person {
	
	private String name;
	private Integer age;
	private String country;
	@EmbeddedId
	private PersonPks pks;
	
	
	public PersonPks getPks() {
		return pks;
	}
	public void setPks(PersonPks pks) {
		this.pks = pks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
	
	

}
