package com.vaccination.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Vaccine {
	@Id
	@GeneratedValue
	Integer vaccineId;
	String vaccineName;
	Double price;
	String vaccineDescription;
	@OneToOne
	Member member;
	public Vaccine() {
		super();
	}
	public Vaccine(Integer vaccineId, String vaccineName, Double price, String vaccineDescription, Member member) {
		super();
		this.vaccineId = vaccineId;
		this.vaccineName = vaccineName;
		this.price = price;
		this.vaccineDescription = vaccineDescription;
		this.member = member;
	}
	public Integer getVaccineId() {
		return vaccineId;
	}
	public void setVaccineId(Integer vaccineId) {
		this.vaccineId = vaccineId;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getVaccineDescription() {
		return vaccineDescription;
	}
	public void setVaccineDescription(String vaccineDescription) {
		this.vaccineDescription = vaccineDescription;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
}
