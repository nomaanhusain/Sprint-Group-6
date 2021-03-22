package com.healthCare.dao;

import java.io.IOException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthCare.exception.PatientNotFoundException;
import com.healthCare.model.Appointment;
import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;

@Repository
public class IPatientRepository {
	
	static Logger log = Logger.getLogger(ITestResultRepository.class);
	static private PatternLayout patternLayout;
	private static FileAppender fileAppender;
	static {
		patternLayout = new PatternLayout("%d ## %M ##* %p ##* %m ## %L %n");
		try {
			fileAppender = new FileAppender(patternLayout, "mylogs.log");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.addAppender(fileAppender);
	}
	

	@Autowired
	private PatientDAO patient;

	@Autowired 
	private TestResultDAO testResult;
	 
	
	public Patient registerPatient(Patient patient1) {
		log.info("Patient added");
		return patient.save(patient1);
	}

	public Patient updatePatient(Patient patient1) {
		log.info("Patient updated");
		return patient.save(patient1);
	}

	public Patient viewPatient(String patientName) {
		Optional<Patient> optional=patient.findByName(patientName);
		Patient emp=optional.orElseThrow(()->new PatientNotFoundException("Patient Not Exists"));
		return emp;
		}
	
	//not complete
	public Set<TestResult> getAllTestResult(String patientname) {
		Set<TestResult> mergedSet = new HashSet<>();
		Optional<Patient> optional=patient.findByName(patientname);
		Set<Appointment> appointmentSet=optional.get().getAppointment();
		for (Appointment app : appointmentSet) {
			mergedSet.addAll(app.getTestResult());
		}
		return mergedSet;
	}

	
	 public TestResult viewTestResult(int testResultId) { 
			 Optional<TestResult> optional = testResult.findById(testResultId); 
			 return optional.get();
	 	}
	 
	public Patient getPatientById(Integer pid) {
		Optional<Patient> optional=patient.findById(pid);
		Patient emp=optional.orElseThrow(()->new PatientNotFoundException("Patient Not Exists"));
		return emp;
	}
}
