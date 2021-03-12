package com.healthCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthCare.model.Appointment;
import com.healthCare.model.DiagnosticCenter;
import com.healthCare.model.DiagnosticTest;
import com.healthCare.model.TestResult;
import com.healthCare.service.IDiagnosticCenter;



@RestController
@RequestMapping("/hcdcc")                  //hcdcc:heatlh care diagnostic center controller
public class DiagnosticCenterController {
	@Autowired
	private IDiagnosticCenter icenter;
	
	
	//******************completed******************************************************************************
	// to get list of all Diagnostic Center
	@GetMapping("/Centers")
	public List<DiagnosticCenter> getAllDiagnosticCenters()
	{
		 List<DiagnosticCenter> list= icenter.getAllDiagnosticCenters();
		 return list;
	}
	
	//******************completed**********************************************************************************
	//to add Diagnostic Center
		@PostMapping("/Centers")
		public ResponseEntity<DiagnosticCenter> addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
			
			DiagnosticCenter center = icenter.addDiagnosticCenter(diagnosticCenter);
			return new ResponseEntity<DiagnosticCenter>(center, HttpStatus.ACCEPTED);
			
		}
		
		//to get Diagnostic Center of particular Id.
		@GetMapping("/Centers/{diagnosticCenterId}")
		
		public ResponseEntity<DiagnosticCenter> getDiagnosticCenterById(@PathVariable int diagnosticCenterId)
		{
			DiagnosticCenter centerId=icenter.getDiagnosticCenterById(diagnosticCenterId);
			return new ResponseEntity<DiagnosticCenter>(centerId,HttpStatus.OK);
		}
		
		
		
		//*********************completed****************************************************************************
		//to update Diagnostic Center
		@PutMapping("/UpdateCenters")
		public ResponseEntity<DiagnosticCenter> updateDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticcenter) {
			DiagnosticCenter updateCenter = icenter.updateDiagnosticCenter(diagnosticcenter);
			return new ResponseEntity<DiagnosticCenter>(updateCenter, HttpStatus.OK);
		}

	
		//to view test Details
		@GetMapping("/viewTest/{diagnosticCenterId},{testName}")
		public ResponseEntity<DiagnosticTest>viewTestDetails (@PathVariable int diagnosticCenterId,String testName){
			DiagnosticTest viewTest=icenter.viewTestDetails(diagnosticCenterId, testName);
			return  new ResponseEntity<DiagnosticTest>(viewTest,HttpStatus.OK);
		}
		
	
//		//to add test 
//		@PostMapping("/addTest/{diagnosticCenterId},{testId}")
//		public ResponseEntity<String>addTest (@RequestBody int diagnosticCenterId,@PathVariable int testId){
//			DiagnosticTest test = icenter.addTest(diagnosticCenterId,testId);
//			return new ResponseEntity<String>("Test With ID :" + testId + " added Successfully", HttpStatus.CREATED);
//			
//		}
		
		
		
		//to get Diagnostic Center by name
        @GetMapping("/Centers/{centername}")
		
		public ResponseEntity<DiagnosticCenter> getDiagnosticCenter(@PathVariable String centername)
		{
			DiagnosticCenter centerName=icenter.getDiagnosticCenter(centername);
			return new ResponseEntity<DiagnosticCenter>(centerName,HttpStatus.OK);
		}
        
        
       
		//to delete Diagnostic Center of particular id
		//************************************completed**********************************************
		@DeleteMapping(value =  "/removeCenter/{id}")
		public ResponseEntity<String> removeDiagnosticCenter(@PathVariable Integer id)
		{
			icenter.removeDiagnosticCenter(id);
			return new ResponseEntity<String>("Diagnostic Center With ID :" + id + " Deleted Successfully", HttpStatus.OK);
		}
		
		
		//******************************checked**************************************************
		//to get list of appointments
		@GetMapping("/listOfAppointments/{centerName}")
		public ResponseEntity<List<Appointment>>getListOfAppointments(@PathVariable String centerName) {
			List<Appointment> list = icenter.getListOfAppointments(centerName);
			return  new ResponseEntity<List<Appointment>>(list,HttpStatus.OK);
		}
		
}