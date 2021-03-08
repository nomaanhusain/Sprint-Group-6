package com.healthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.healthCare.service.IDiagnosticTestService;

@Controller
public class DiagnosticTestController {
	@Autowired
	private IDiagnosticTestService digServices;
}
