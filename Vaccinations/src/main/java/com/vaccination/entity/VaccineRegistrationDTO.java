package com.vaccination.entity;

import java.time.LocalDate;

public class VaccineRegistrationDTO {
	Integer registerId;
	Long mobileNo;
	LocalDate dateofregistration;
	public VaccineRegistrationDTO() {
		super();
	}
	public VaccineRegistrationDTO(Integer registerId,Long mobileNo, LocalDate dateofregistration) {
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
