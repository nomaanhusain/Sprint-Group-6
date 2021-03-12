package com.healthCare.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.healthCare.dao.IDiagnosticCenterRepository;
import com.healthCare.exception.CenterNotFoundException;
import com.healthCare.model.Appointment;
import com.healthCare.model.DiagnosticCenter;
import com.healthCare.model.DiagnosticTest;

@Service
public class IDiagnosticCenterServiceImpl implements IDiagnosticCenter {
	
	@Autowired
	private IDiagnosticCenterRepository centerDao;

	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters() {
		List<DiagnosticCenter> centerList=centerDao.getAllDiagnosticCenter();
		return centerList;
	}

	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		DiagnosticCenter  addCenter= centerDao.addDiagnosticCenter(diagnosticCenter);
		return addCenter;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenterById(int diagnosticCenterId) {
		DiagnosticCenter diag=centerDao.getDiagnosticCenterById(diagnosticCenterId);
		return diag;
	}

	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		DiagnosticCenter updateCenter=centerDao.updateDiagnosticCenter(diagnosticCenter);
		return updateCenter;
	}

	@Override
	public DiagnosticTest viewTestDetails(int diagnosticCenterId, String testName) {
		DiagnosticTest view_test=centerDao.viewTestDetails(diagnosticCenterId,testName);
		return view_test;
	}

	@Override
	public DiagnosticTest addTest(int diagnosticcenterId, int testId) {
		DiagnosticTest diag_test = centerDao.addTest(diagnosticcenterId,testId);
		return diag_test;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenter(String centername) {
		DiagnosticCenter centerName=centerDao.getDiagnosticCenter(centername);
		return centerName;

	}

	@Override
	public DiagnosticCenter removeDiagnosticCenter(int id) {
		DiagnosticCenter centerId= centerDao.removeDiagnosticCenter(id);
		return centerId;
	}

	@Override
	public List<Appointment> getListOfAppointments(String centerName) {
		return centerDao.getListOfAppointments(centerName);

	}


}