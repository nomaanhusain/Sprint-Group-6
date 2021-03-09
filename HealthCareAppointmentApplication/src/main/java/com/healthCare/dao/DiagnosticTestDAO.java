package com.healthCare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthCare.model.DiagnosticTest;


public class DiagnosticTestDAO  {
	@Autowired
	private IDiagnosticTestRepository digTestDao;

	public List<DiagnosticTest> getAllTest() {
		List<DiagnosticTest> ls = digTestDao.findAll();
		return ls;
	}

	public DiagnosticTest addNewTest(DiagnosticTest test) {
		DiagnosticTest dig = digTestDao.save(test);
		return dig;
	}

	public List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId) {
		List<DiagnosticTest> list = digTestDao.findByCenterId(centerId);
		return list;
	}

	// This might be wrong, please check!
	public DiagnosticTest updateTestDetail(DiagnosticTest test) {
		DiagnosticTest dig = digTestDao.save(test);
		return dig;
	}

	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test) {
		
	}
}
