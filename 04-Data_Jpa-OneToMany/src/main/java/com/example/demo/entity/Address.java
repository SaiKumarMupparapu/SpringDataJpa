package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aId;
	private String adrsType;
	private String city;
	private String state;
	private String Countery;
	
	@ManyToOne
	@JoinColumn(name ="eId")
	private Employee emp;
	
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountery() {
		return Countery;
	}
	public void setCountery(String countery) {
		Countery = countery;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getAdrsType() {
		return adrsType;
	}
	public void setAdrsType(String adrsType) {
		this.adrsType = adrsType;
	}
	
	
	

}
