package com.healthCare.service;

import java.util.Set;

import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;

public interface IPatientService {

	public Patient registerPatient(Patient patient);
	
	public Patient updatePatient(Patient patient);
	
	public Patient viewPatient(String patientName);
	
	Set<TestResult> getAllTestResult(String patientUserName);
	
	TestResult viewTestResult(int testResultId);
	
}