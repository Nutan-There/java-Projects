package com.vaccination.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccination.entity.VaccineRegistration;

import com.vaccination.exception.VaccineRegistrationNotFoundException;
import com.vaccination.repository.VaccineRegistrationRepository;
@Service
public class VaccineRegistrationServiceImp implements VaccineRegistrationService {
	
    @Autowired
	private VaccineRegistrationRepository vaccineRegistrationRepo;
	
	@Override
	public VaccineRegistration addVaccineRegistration(VaccineRegistration reg) {
		return this.vaccineRegistrationRepo.save(reg);
	}

	@Override
	public VaccineRegistration updateVaccineRegistration(VaccineRegistration reg) throws VaccineRegistrationNotFoundException {
		Optional<VaccineRegistration> vaccineRegistrationOpt=this.vaccineRegistrationRepo.findById(reg.getRegisterId());
		if(vaccineRegistrationOpt.isEmpty())
			throw new VaccineRegistrationNotFoundException("Vaccine Registration does not exist to update");
		VaccineRegistration updateVaccineRegistration  = vaccineRegistrationOpt.get();
		updateVaccineRegistration.setMobileNo(reg.getMobileNo());
		
		return this.vaccineRegistrationRepo.save(updateVaccineRegistration);
		
		
	}
	

	@Override
	public String deleteVaccineRegistration(Integer registerId) throws VaccineRegistrationNotFoundException {
		Optional<VaccineRegistration> vaccineRegistrationOpt=this.vaccineRegistrationRepo.findById(registerId);
		if(vaccineRegistrationOpt.isEmpty())
			throw new VaccineRegistrationNotFoundException("Vaccine Registration not exist to delete");
		this.vaccineRegistrationRepo.deleteById(registerId);
		return "Delete succesfully";
	}

	@Override
	public VaccineRegistration getVaccineRegistrationById(Integer registerId) throws VaccineRegistrationNotFoundException {
		Optional<VaccineRegistration> vaccineRegistrationOpt=this.vaccineRegistrationRepo.findById(registerId);
		if(vaccineRegistrationOpt.isEmpty())
			throw new VaccineRegistrationNotFoundException("Vaccine Registration does not Exist");
		return vaccineRegistrationOpt.get();
	}

	@Override
	public List<VaccineRegistration> getAllVaccineRegistrations() {
		return this.vaccineRegistrationRepo.findAll();
	}

}
