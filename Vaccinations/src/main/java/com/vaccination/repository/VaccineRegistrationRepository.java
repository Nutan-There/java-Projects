package com.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vaccination.entity.VaccineRegistration;

public interface VaccineRegistrationRepository extends JpaRepository<VaccineRegistration,Integer> {

	

}
