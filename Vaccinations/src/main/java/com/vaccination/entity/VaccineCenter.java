package com.vaccination.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class VaccineCenter {
	@Id
	@GeneratedValue
	Integer centerId;
	String centerName;
	String address;
	String pincode;
	@OneToMany
	List<Vaccine> vaccines=new ArrayList<Vaccine>() ;
	public VaccineCenter() {
		super();
	}
	public VaccineCenter(Integer centerId, String centerName, String address, String pincode, List<Vaccine> vaccines) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.address = address;
		this.pincode = pincode;
		this.vaccines = vaccines;
	}
	public Integer getCenterId() {
		return centerId;
	}
	public void setCenterId(Integer centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public List<Vaccine> getVaccines() {
		return vaccines;
	}
	public void setVaccines(List<Vaccine> vaccines) {
		this.vaccines = vaccines;
	}
	
}
