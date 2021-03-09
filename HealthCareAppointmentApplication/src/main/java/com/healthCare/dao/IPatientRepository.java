package com.healthCare.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthCare.exception.PatientNotFoundException;
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
	
	public Patient getPatientById(Integer pid) {
		Optional<Patient> optional=patient.findById(pid);
		Patient emp=optional.orElseThrow(()->new PatientNotFoundException("Patient Not Exists"));
		return emp;
	}
}
