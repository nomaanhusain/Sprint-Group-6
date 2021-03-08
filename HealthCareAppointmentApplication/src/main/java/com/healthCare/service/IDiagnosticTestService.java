package com.healthCare.service;

import java.util.List;

import com.healthCare.model.DiagnosticTest;

public interface IDiagnosticTestService {
	public List<DiagnosticTest> getAllTest();

	public DiagnosticTest addNewTest(DiagnosticTest test);

	public List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId);

	public DiagnosticTest updateTestDetail(DiagnosticTest test);

	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test);
}