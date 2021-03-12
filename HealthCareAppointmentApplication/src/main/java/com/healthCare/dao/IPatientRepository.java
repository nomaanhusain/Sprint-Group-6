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

	/*
	 * @Autowired private TestResultDAO testResult;
	 */
	
	public Patient registerPatient(Patient patient1) {
		return patient.save(patient1);
	}

	public Patient updatePatient(Patient patient1) {
		return patient.save(patient1);
	}

	public Patient viewPatient(String patientName) {
		Optional<Patient> optional=patient.findByName(patientName);
		Patient emp=optional.orElseThrow(()->new PatientNotFoundException("Patient Not Exists"));
		return emp;
		}
	
	private void Throw(PatientNotFoundException patientNotFoundException) {
		// TODO Auto-generated method stub
		
	}

	//not complete
	public List<TestResult> getAllTestResult(String patientUserName) {
		return null;
	}

	/*
	 * public TestResult viewTestResult(int testResultId) { Optional<TestResult>
	 * optional = testResult.findById(testResultId); return optional.get(); }
	 */
	public Patient getPatientById(Integer pid) {
		Optional<Patient> optional=patient.findById(pid);
		Patient emp=optional.orElseThrow(()->new PatientNotFoundException("Patient Not Exists"));
		return emp;
	}
}
