package com.healthCare.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.IPatientRepository;
import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;

@Service
public class IPatientServiceImpl implements IPatientService {
	
	@Autowired
	private IPatientRepository prepository;

	@Override
	public Patient registerPatient(Patient patient) {
		return prepository.registerPatient(patient);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		return prepository.updatePatient(patient);
	}

	@Override
	public Patient viewPatient(String patientName) {
		return prepository.viewPatient(patientName);
	}

	@Override
	public Set<TestResult> getAllTestResult(String patientUserName) {
		return prepository.getAllTestResult(patientUserName);
	}

	
	@Override 
	public TestResult viewTestResult(int testResultId) 
	{ 
	    return prepository.viewTestResult(testResultId);
	}
	 
	public Patient getPatientById(Integer pid) {
		return prepository.getPatientById(pid);
	}

	
	
}
