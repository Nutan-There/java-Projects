package com.vaccination.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vaccination.exception.VaccineRegistrationNotFoundException;

@RestControllerAdvice
public class VaccineRegistrationControllerAdvice {
	
		@ResponseStatus(code = HttpStatus.BAD_REQUEST)
		@ExceptionHandler(VaccineRegistrationNotFoundException.class)
		public String exceptionHandler(Exception e) {
			return e.getMessage();
		}
	}

