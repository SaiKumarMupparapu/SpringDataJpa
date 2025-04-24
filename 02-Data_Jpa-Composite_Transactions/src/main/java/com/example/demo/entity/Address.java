package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer aId;
	private String city;
	private String State;
	private String Countery;
	
	private Integer eId;

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
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountery() {
		return Countery;
	}

	public void setCountery(String countery) {
		Countery = countery;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", State=" + State + ", Countery=" + Countery + ", eId=" + eId
				+ "]";
	}
	
	
	
	

}
