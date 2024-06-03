package com.vaccination.service;

import java.util.List;

import com.vaccination.entity.VaccineRegistration;
import com.vaccination.exception.VaccineRegistrationNotFoundException;

public interface VaccineRegistrationService {
	public VaccineRegistration addVaccineRegistration(VaccineRegistration reg);
	public VaccineRegistration updateVaccineRegistration(VaccineRegistration reg) throws VaccineRegistrationNotFoundException;
	public String deleteVaccineRegistration(Integer registerId) throws VaccineRegistrationNotFoundException;
	public VaccineRegistration getVaccineRegistrationById(Integer registerId) throws VaccineRegistrationNotFoundException;
	public List<VaccineRegistration> getAllVaccineRegistrations();
}
