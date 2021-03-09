package com.healthCare.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.healthCare.service.IAppointmentServiceImpl;


@Controller
public class AppointmentController {

	@Autowired
	private  IAppointmentServiceImpl aservice;
	
	
}