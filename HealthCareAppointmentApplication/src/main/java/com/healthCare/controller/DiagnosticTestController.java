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
import com.healthCare.model.Users;
import com.healthCare.service.IDiagnosticTestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RestController
@RequestMapping("/hcdtc")
@Api(value = "Diagnostic Test", tags = { "Diagnostic Test" })
public class DiagnosticTestController {
	@Autowired
	private IDiagnosticTestService digServices;

	@GetMapping("/DiagnosticTestAll")
	@ApiOperation(value = "List all the tests available", response = DiagnosticTest.class)
	public ResponseEntity<List<DiagnosticTest>> getAllTest() {
		List<DiagnosticTest> list = digServices.getAllTest();
		return new ResponseEntity<List<DiagnosticTest>>(list, HttpStatus.OK);
	}

	@GetMapping("/TestsOfDiagnosticCenters/{centerId}")
	@ApiOperation(value = "List all the tests available at a center", response = DiagnosticTest.class)
	public ResponseEntity<List<DiagnosticTest>> getTestsOfDiagnosticCenter(@PathVariable int centerId) {
		List<DiagnosticTest> list = digServices.getTestsOfDiagnosticCenter(centerId);
		return new ResponseEntity<List<DiagnosticTest>>(list, HttpStatus.OK);
	}

	@PostMapping("/addTest")
	@ApiOperation(value = "Add Test", response = DiagnosticTest.class)
	public ResponseEntity<DiagnosticTest> addNewTest(@RequestBody DiagnosticTest test) {
		DiagnosticTest dig = digServices.addNewTest(test);
		return new ResponseEntity<DiagnosticTest>(dig, HttpStatus.CREATED);
	}

	@PutMapping("/UpdateTest")
	@ApiOperation(value = "Update Test", response = DiagnosticTest.class)
	public ResponseEntity<DiagnosticTest> updateTestDetail(@RequestBody DiagnosticTest test) {
		DiagnosticTest dig = digServices.updateTestDetail(test);
		return new ResponseEntity<DiagnosticTest>(dig, HttpStatus.OK);
	}

	@DeleteMapping("/RemoveTestFromCenter/{centerId}")
	@ApiOperation(value = "Remove a test from a center", response = DiagnosticTest.class)
	public ResponseEntity<DiagnosticTest> removeTestFromDiagnosticCenter(@PathVariable int centerId,
			@RequestBody DiagnosticTest test) {
		DiagnosticTest dig = digServices.removeTestFromDiagnosticCenter(centerId, test);
		return new ResponseEntity<DiagnosticTest>(dig, HttpStatus.OK);
	}

}
