package com.healthCare.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthCare.exception.CenterNotFoundException;

import com.healthCare.model.Appointment;
import com.healthCare.model.DiagnosticCenter;
import com.healthCare.model.DiagnosticTest;
import com.healthCare.model.TestResult;

@Repository
public class IDiagnosticCenterRepository {
	@Autowired
	private DiagnosticCenterDAO diagCenterDao;
	//*****************************************************checked************************************************************
	public List<DiagnosticCenter> getAllDiagnosticCenter() {
		List<DiagnosticCenter> centerList = diagCenterDao.findAll();
		return centerList;
	}
	
//checked*************************************************************************************************************
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		DiagnosticCenter diag = diagCenterDao.save(diagnosticCenter);
		return diag;
	}
	

	//checked

	public DiagnosticCenter getDiagnosticCenterById(int diagnosticCenterId) {
		Optional<DiagnosticCenter> optional=diagCenterDao.findById(diagnosticCenterId);
		DiagnosticCenter diag=optional.orElseThrow(()->new CenterNotFoundException("Center Not Exists"));
		return diag;
	}
	
//checked
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		DiagnosticCenter updateCenter = diagCenterDao.save(diagnosticCenter);
		return updateCenter;
	}

//need a check,not sure of logic
	public DiagnosticTest viewTestDetails(int diagnosticCenterId, String testName) {
		// TODO Auto-generated method stub
		DiagnosticTest view_test=diagCenterDao.viewTestDetails(diagnosticCenterId,testName);
		return view_test;
	}

	//need a check
	public DiagnosticTest addTest(int diagnosticcenterId, int testId) {
		DiagnosticTest diag_test = diagCenterDao.addTest(diagnosticcenterId,testId);
		return diag_test;
	
	}

	//--checked
	public DiagnosticCenter getDiagnosticCenter(String centername) {
		Optional<DiagnosticCenter> optional=diagCenterDao.findByName(centername);
		DiagnosticCenter centerName=optional.orElseThrow(()->new CenterNotFoundException("Center Not Exists"));
		return centerName;

	}
//**********************************************************************************************************checked******************************************************
	public DiagnosticCenter removeDiagnosticCenter(int id) {

		Optional<DiagnosticCenter> op=diagCenterDao.findById(id);

		DiagnosticCenter dc= (DiagnosticCenter) op.orElseThrow(()-> new CenterNotFoundException("Center Does Not Exists"));
		diagCenterDao.delete(dc);
		return dc;

	}

	
	public List<Appointment> getListOfAppointments(String centerName) {
		// TODO Auto-generated method stub
		return null;
				//diagCenterDao.getListOfAppointments(centerName);
		
		
	}

	



	
	}