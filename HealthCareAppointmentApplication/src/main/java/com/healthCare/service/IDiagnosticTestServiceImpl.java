package com.healthCare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.healthCare.dao.IDiagnosticTestRepository;
import com.healthCare.model.DiagnosticTest;

@Service
public class IDiagnosticTestServiceImpl implements IDiagnosticTestService {

	@Override
	public DiagnosticTest addNewTest(DiagnosticTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiagnosticTest> getAllTest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticTest updateTestDetail(DiagnosticTest test) {
		// TODO Auto-generated method stub
		return null;
	}
}
