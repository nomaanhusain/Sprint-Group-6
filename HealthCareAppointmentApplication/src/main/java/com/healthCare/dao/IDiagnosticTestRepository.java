package com.healthCare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthCare.model.DiagnosticTest;

@Repository
public class IDiagnosticTestRepository {
	@Autowired
	private DiagnosticTestDAO digTestDao;

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

	
	public DiagnosticTest updateTestDetail(DiagnosticTest test) {
		DiagnosticTest dig = digTestDao.save(test);
		return dig;
	}

	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test) {
		DiagnosticTest dig=digTestDao.deleteByCenterId(centerId, test);
		return dig;
	}
}