package com.example.demo.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private String pId;
	private String pName;
	private Double pPrice;
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate creatinDate;
	@Column(insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;
	

	public String getpId() {
		return pId;
	}


	public void setpId(String pId) {
		this.pId = pId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public Double getpPrice() {
		return pPrice;
	}


	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}


	public LocalDate getCreatinDate() {
		return creatinDate;
	}


	public void setCreatinDate(LocalDate creatinDate) {
		this.creatinDate = creatinDate;
	}


	public LocalDate getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}


	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", creatinDate=" + creatinDate
				+ ", updatedDate=" + updatedDate + "]";
	}


	
	

}
