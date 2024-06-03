package com.vaccination.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VaccineRegistration {
	@Id
	@GeneratedValue
	
	Integer registerId;
	Long mobileNo;
	LocalDate dateofregistration;
	public VaccineRegistration() {
		super();
	}
	public VaccineRegistration(Integer registerId,Long mobileNo, LocalDate dateofregistration) {
		super();
		this.registerId = registerId;
		this.mobileNo = mobileNo;
		this.dateofregistration = dateofregistration;
	}
	
	public Integer getRegisterId() {
		return registerId;
	}
	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalDate getDateofregistration() {
		return dateofregistration;
	}
	public void setDateofregistration(LocalDate dateofregistration) {
		this.dateofregistration = dateofregistration;
	}
	
}
