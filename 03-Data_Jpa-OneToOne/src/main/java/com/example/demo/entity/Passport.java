package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ppId;
	
	private String ppNum;
	private LocalDate issuedDate;
	private LocalDate expdDate;
	@OneToOne
	@JoinColumn(name = "pId")
	Person person;
	public int getPpId() {
		return ppId;
	}
	public void setPpId(int ppId) {
		this.ppId = ppId;
	}
	public String getPpNum() {
		return ppNum;
	}
	public void setPpNum(String ppNum) {
		this.ppNum = ppNum;
	}
	public LocalDate getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}
	public LocalDate getExpdDate() {
		return expdDate;
	}
	public void setExpdDate(LocalDate expdDate) {
		this.expdDate = expdDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Passport [ppId=" + ppId + ", ppNum=" + ppNum + ", issuedDate=" + issuedDate + ", expdDate=" + expdDate
				+ ", person=" + person + "]";
	}
	
	
	

}
