package com.healthCare.service;

import java.util.List;

import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;

public interface IPatientService {

	public Patient registerPatient(Patient patient);
	
	public Patient updatePatient(Patient patient);
	
	public Patient viewPatient(String patientName);
	
	List<TestResult> getAllTestResult(String patientUserName);
	
	TestResult viewTestResult(int testResultId);
	
}