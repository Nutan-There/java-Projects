package com.vaccination.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Member {
	@Id
    Long adharNo;
	Long mobileNo;
	String name;
	Integer age;
	
   @OneToOne
   VaccineRegistration vaccineRegistration;
	
	@OneToMany
	List<Appointment> appointments=new ArrayList<Appointment>();
	@OneToOne
	Vaccine vaccine;
	LocalDate Does1Date;
	LocalDate Does2Date;
	String Does1Status;
	String Does2Status;
	public Member() {
		super();
	}
	public Member(Long adharNo, Long mobileNo, String name, Integer age, VaccineRegistration vaccineRegistration,
			List<Appointment> appointments, Vaccine vaccine, LocalDate does1Date, LocalDate does2Date,
			String does1Status, String does2Status) {
		super();
		this.adharNo = adharNo;
		this.mobileNo = mobileNo;
		this.name = name;
		this.age = age;
		this.vaccineRegistration = vaccineRegistration;
		this.appointments = appointments;
		this.vaccine = vaccine;
		Does1Date = does1Date;
		Does2Date = does2Date;
		Does1Status = does1Status;
		Does2Status = does2Status;
	}
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
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
	public VaccineRegistration getVaccineRegistration() {
		return vaccineRegistration;
	}
	public void setVaccineRegistration(VaccineRegistration vaccineRegistration) {
		this.vaccineRegistration = vaccineRegistration;
	}
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	public Vaccine getVaccine() {
		return vaccine;
	}
	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}
	public LocalDate getDoes1Date() {
		return Does1Date;
	}
	public void setDoes1Date(LocalDate does1Date) {
		Does1Date = does1Date;
	}
	public LocalDate getDoes2Date() {
		return Does2Date;
	}
	public void setDoes2Date(LocalDate does2Date) {
		Does2Date = does2Date;
	}
	public String getDoes1Status() {
		return Does1Status;
	}
	public void setDoes1Status(String does1Status) {
		Does1Status = does1Status;
	}
	public String getDoes2Status() {
		return Does2Status;
	}
	public void setDoes2Status(String does2Status) {
		Does2Status = does2Status;
	}
		
}
