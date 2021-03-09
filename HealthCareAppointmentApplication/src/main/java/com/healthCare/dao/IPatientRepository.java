package com.healthCare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;

@Repository
public class IPatientRepository {

	@Autowired
	private PatientDAO patient;
	
public Patient registerPatient(Patient patient) {
		
		return null;
	}

	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	public Patient viewPatient(String patientUserName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TestResult> getAllTestResult(String patientUserName) {
		// TODO Auto-generated method stub
		return null;
	}


	public TestResult viewTestResult(int testResultId) {
		// TODO Auto-generated method stub
		return null;
	}

}
