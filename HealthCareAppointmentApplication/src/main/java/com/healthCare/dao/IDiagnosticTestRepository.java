package com.healthCare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthCare.model.DiagnosticTest;

@Repository
public class IDiagnosticTestRepository {
	@Autowired
	private DiagnosticTestDAO digTestDao;

	public List<DiagnosticTest> getAllTest() {

	}
	public DiagnosticTest addNewTest(DiagnosticTest test) {
		
	}
	public List<DiagnosticTest> getTestsOfDiagnosticCenter() {
		
	}
	public DiagnosticTest updateTestDetail(DiagnosticTest test) {
		
	}
	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test) {
		
	}
}
