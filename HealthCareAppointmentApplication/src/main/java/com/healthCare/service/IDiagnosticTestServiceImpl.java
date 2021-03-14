package com.healthCare.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.IDiagnosticTestRepository;
import com.healthCare.model.DiagnosticTest;

@Service
public class IDiagnosticTestServiceImpl implements IDiagnosticTestService {
	
	@Autowired
	private IDiagnosticTestRepository diagnosticRep;
	@Override
	public DiagnosticTest addNewTest(DiagnosticTest test) {
		DiagnosticTest dig= diagnosticRep.addNewTest(test);
		return dig;
	}

	@Override
	public List<DiagnosticTest> getAllTest() {
		List<DiagnosticTest> list=diagnosticRep.getAllTest();
		return list;
	}

	@Override
	public Set<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId) {
		Set<DiagnosticTest> list=diagnosticRep.getTestsOfDiagnosticCenter(centerId);
		return list;
	}

	@Override
	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test) {
		DiagnosticTest dig=diagnosticRep.removeTestFromDiagnosticCenter(centerId, test);
		return dig;
	}

	@Override
	public DiagnosticTest updateTestDetail(DiagnosticTest test) {
		DiagnosticTest dig = diagnosticRep.updateTestDetail(test);
		return dig;
	}
}
