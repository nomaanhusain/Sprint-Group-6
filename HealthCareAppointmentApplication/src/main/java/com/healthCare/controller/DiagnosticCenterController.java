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
import org.springframework.web.bind.annotation.RestController;



import com.healthCare.model.DiagnosticCenter;

import com.healthCare.service.IDiagnosticCenter;



@RestController
public class DiagnosticCenterController {
	@Autowired
	private IDiagnosticCenter icenter;
	@GetMapping("/Centers")
	public List<DiagnosticCenter> getAllDiagnosticCenters()
	{
		//List<DiagnosticCenter> centers=icenter.getAllDiagnosticCenters();
		return this.icenter.getAllDiagnosticCenters();
	}
	
	//to add Diagnostic Center
		@PostMapping("/Centers")
		public DiagnosticCenter addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
			return icenter.addDiagnosticCenter(diagnosticCenter);
			
		}
		
		//to get Diagnostic Center of particular Id.
		@GetMapping("/Centers/{diagnosticCenterId}")
		
		public ResponseEntity<DiagnosticCenter> getDiagnosticCenterById(@PathVariable int diagnosticCenterId)
		{
			DiagnosticCenter centerId=icenter.getDiagnosticCenterById(diagnosticCenterId);
			return new ResponseEntity<DiagnosticCenter>(centerId,HttpStatus.OK);
		}
		
		//to update Diagnostic Center
		@PutMapping("/Centers")
		public DiagnosticCenter updateDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticcenter) {
			return icenter.updateDiagnosticCenter(diagnosticcenter);
		}

		@DeleteMapping(value = "/delete/{id}")
		public ResponseEntity<DiagnosticCenter> removeDiagnosticCenter(@PathVariable Integer id)
		{
			icenter.removeDiagnosticCenter(id);
			return new ResponseEntity<DiagnosticCenter>(HttpStatus.OK);
		}
		
        @GetMapping("/Centers/{centername}")
		
		public ResponseEntity<DiagnosticCenter> getDiagnosticCenter(@PathVariable String centername)
		{
			DiagnosticCenter centerName=icenter.getDiagnosticCenter(centername);
			return new ResponseEntity<DiagnosticCenter>(centerName,HttpStatus.OK);
		}
		
}