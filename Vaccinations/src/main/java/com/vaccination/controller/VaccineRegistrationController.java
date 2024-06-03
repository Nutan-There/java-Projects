package com.vaccination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaccination.entity.VaccineRegistration;
import com.vaccination.exception.VaccineRegistrationNotFoundException;
import com.vaccination.service.VaccineRegistrationService;
@RestController
@RequestMapping("v1")
@CrossOrigin(value="http://localhost:3000/")
public class VaccineRegistrationController {
	@Autowired
	private VaccineRegistrationService vaccineRegistrationService;
	
	@PostMapping("vaccineRegistration")
	public VaccineRegistration addVaccineRegistration(@RequestBody VaccineRegistration vaccineRegistration) {
		
		return this.vaccineRegistrationService.addVaccineRegistration(vaccineRegistration);
	}

	@PutMapping("vaccineRegistration")
	public VaccineRegistration updatedVaccineRegistration(@RequestBody VaccineRegistration vaccineRegistration) throws  VaccineRegistrationNotFoundException{
	  return this.vaccineRegistrationService.updateVaccineRegistration(vaccineRegistration);
	}
	@DeleteMapping("vaccineRegistration/{registerId}")
	public String deleteVaccineRegistration(@PathVariable("registerId")Integer registerId) throws VaccineRegistrationNotFoundException {
		return this.vaccineRegistrationService.deleteVaccineRegistration(registerId);
		
	}

	@GetMapping("vaccineRegistration/{registerId}")
	public VaccineRegistration getVaccineRegistrationById(@PathVariable("registerId")Integer registerId) throws  VaccineRegistrationNotFoundException{
		return this.vaccineRegistrationService.getVaccineRegistrationById(registerId);
		
	}
	@GetMapping("vaccineRegistrations")
	public List<VaccineRegistration> getAllVaccineCenters(){
		return this.vaccineRegistrationService.getAllVaccineRegistrations();
		
	}


}
