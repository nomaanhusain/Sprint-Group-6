package com.healthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.PatientDAO;
import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;

@Service
public class IPatientServiceImpl implements IPatientService {
	
	@Autowired
	private PatientDAO pdao;

	@Override
	public Patient registerPatient(Patient patient) {
		
		return null;
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient viewPatient(String patientUserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TestResult> getAllTestResult(String patientUserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TestResult viewTestResult(int testResultId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
