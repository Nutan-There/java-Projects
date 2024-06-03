package com.vaccination.entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Appointment {
	@Id
	@GeneratedValue
	Integer appointmentId;
	LocalDate dateofAppointment;
    Slot slot;
    @ManyToMany
    List<VaccineCenter>vaccineCenters=new ArrayList<VaccineCenter>();
    
	public Appointment() {
		super();
	}
	public Appointment(Integer appointmentId,LocalDate dateofAppointment,Slot slot, List<VaccineCenter> vaccineCenters) {
		super();
		this.appointmentId = appointmentId;
		this.dateofAppointment = dateofAppointment;
		this.slot = slot;
		this.vaccineCenters = vaccineCenters;
		
	}
	public LocalDate getDateofAppointment() {
		return dateofAppointment;
	}
	public void setDateofAppointment(LocalDate dateofAppointment) {
		this.dateofAppointment = dateofAppointment;
	}
	public Integer getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Slot getSlot() {
		return slot;
	}
	public void setSlot(Slot slot) {
		this.slot = slot;
	}
	public List<VaccineCenter> getVaccineCenters() {
		return vaccineCenters;
	}
	public void setVaccineCenters(List<VaccineCenter> vaccineCenters) {
		this.vaccineCenters = vaccineCenters;
	}
	
    
}
