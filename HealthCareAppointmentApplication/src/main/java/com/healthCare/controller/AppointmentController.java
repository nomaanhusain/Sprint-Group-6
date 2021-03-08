package com.healthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.healthCare.dao.IAppointmentRepository;


@Controller
public class AppointmentController {

	@Autowired
	private  IAppointmentRepository repository;
	
	
}
