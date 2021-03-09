package com.healthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.healthCare.dao.IPatientRepository;

@Controller
public class PatientController {

	@Autowired
	private  IPatientRepository prepository;
}
