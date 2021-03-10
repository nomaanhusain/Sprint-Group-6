package com.healthCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;
import com.healthCare.service.IPatientServiceImpl;

@RestController
@RequestMapping(value = "/hcpc")	//hcac = health care patient controller
public class PatientController {

	@Autowired
	private  IPatientServiceImpl pservice;
	
	@PostMapping(value = "/registerPatient")
	public ResponseEntity<String> registerPatient(@RequestBody Patient patient) {
		Patient pati= pservice.registerPatient(patient);
		return new ResponseEntity<String>("Patient with ID :" + pati.getPatientId()+ " created Successfully", HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/updatePatient/{pid}")
	public ResponseEntity<Patient> updatePatient(@PathVariable int pid,@RequestBody Patient patient)
	{
		Patient patient1=pservice.getPatientById(pid);
		patient1.setAge(patient.getAge());
		patient1.setName(patient.getName());
		patient1.setPhoneNo(patient.getPhoneNo());
		patient1.setGender(patient.getGender());
		pservice.registerPatient(patient1);
		return new ResponseEntity<Patient>(patient1,HttpStatus.OK);
	}
	
	@GetMapping(value="/viewPatient/{patientName}")
	public ResponseEntity<Patient> viewPatient(@PathVariable String patientName)
	{
		Patient patient=pservice.viewPatient(patientName);
		return new ResponseEntity<Patient>(patient,HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllTestResult/{patientUserName}")
	public ResponseEntity<List<TestResult>> getAllTestResult(@PathVariable String patientUserName)
	{
		List<TestResult> list=pservice.getAllTestResult(patientUserName);
		return new ResponseEntity<List<TestResult>>(list,HttpStatus.OK);
	}
	
	@GetMapping(value="/viewTestResult/{testResultId}")
	public ResponseEntity<TestResult> viewTestResult(@PathVariable int testResultId)
	{
		TestResult result=pservice.viewTestResult(testResultId);
		return new ResponseEntity<TestResult>(result,HttpStatus.OK);
	}
	
}
