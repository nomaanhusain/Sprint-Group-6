package com.healthCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthCare.model.DiagnosticTest;
import com.healthCare.service.IDiagnosticTestService;

@Controller
@RestController
@RequestMapping("/hcdtc")
public class DiagnosticTestController {
	@Autowired
	private IDiagnosticTestService digServices;
	@GetMapping("/DiagnosticTestAll")
	public List<DiagnosticTest> getAllTest(){
		List<DiagnosticTest> list=digServices.getAllTest();
		return list;
	}
	@GetMapping("/TestsOfDiagnosticCenters/{centerId}")
	public List<DiagnosticTest> getTestsOfDiagnosticCenter(@PathVariable int centerId){
		List<DiagnosticTest> list= digServices.getTestsOfDiagnosticCenter(centerId);
		return list;
	}
	@PostMapping("/addTest")
	public ResponseEntity<DiagnosticTest> addNewTest(DiagnosticTest test) {
		DiagnosticTest dig=digServices.addNewTest(test);
		return new ResponseEntity<DiagnosticTest>(dig,HttpStatus.ACCEPTED);
	}
	@PutMapping("/UpdateTest")
	public ResponseEntity<DiagnosticTest> updateTestDetail(@RequestBody DiagnosticTest test) {
		DiagnosticTest dig=digServices.updateTestDetail(test);
		return new ResponseEntity<DiagnosticTest>(dig,HttpStatus.OK);
	}
	@DeleteMapping("/RemoveTestFromCenter/{centerId}")
	public ResponseEntity<DiagnosticTest> removeTestFromDiagnosticCenter(@PathVariable int centerId,@RequestBody DiagnosticTest test) {
		DiagnosticTest dig=digServices.removeTestFromDiagnosticCenter(centerId, test);
		return new ResponseEntity<DiagnosticTest>(dig,HttpStatus.OK);
	}
	
}
