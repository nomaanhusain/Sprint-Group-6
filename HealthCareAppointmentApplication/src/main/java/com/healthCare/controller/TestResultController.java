package com.healthCare.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;
import com.healthCare.service.ITestResultService;

@Controller
@RestController
@RequestMapping("/hctrc")
public class TestResultController {
	@Autowired
	private ITestResultService testResultService;

	@PostMapping("/addtestresult")
	public ResponseEntity<TestResult> addTestResult(@RequestBody TestResult tr) {
		TestResult t = testResultService.addTestResult(tr);
		return new ResponseEntity<TestResult>(t, HttpStatus.CREATED);
	}

	@PutMapping("/updatetestresult")
	public ResponseEntity<TestResult> updateTestResult(@RequestBody TestResult tr) {
		TestResult t = testResultService.updateTestResult(tr);
		return new ResponseEntity<TestResult>(t, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/removetestresult/{id}")
	public ResponseEntity<String> removeTestResult(@PathVariable int id) {
		testResultService.removeTestResult(id);
		return new ResponseEntity<String>("Record Removed", HttpStatus.OK);
	}

	@GetMapping("/viewresultbypatient")
	public ResponseEntity<Set<TestResult>> viewResultByPatient(@RequestBody Patient patient) {
		Set<TestResult> set = testResultService.viewResultsByPatient(patient);
		return new ResponseEntity<Set<TestResult>>(set, HttpStatus.OK);
	}
}
