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
public class DiagnosticCenterImpl implements IDiagnosticCenter {
	
	@Autowired
	private IDiagnosticCenterRepository centerDao;
	public DiagnosticCenterImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters() {
		return centerDao.findAll();
	}

	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
        centerDao.save(diagnosticCenter);
		return diagnosticCenter;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenterById(int diagnosticCenterId) {
		Optional<DiagnosticCenter> optional=centerDao.findById(diagnosticCenterId);
		DiagnosticCenter diag=optional.orElseThrow(()->new CenterNotFoundException("Center Not Exists"));
		return diag;
	}

	
	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		centerDao.save(diagnosticCenter);

		return diagnosticCenter;
	}

	@Override
	public DiagnosticTest viewTestDetails(int diagnosticCenterId, String testName) {
		// TODO Auto-generated method stub
		//Optional<DiagnosticTest> optional=centerDao.
		return null;
	}

	@Override
	//to add test
	public DiagnosticTest addTest(int diagnosticcenterId, int testId) {
		// TODO Auto-generated method stub
	
		return null;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenter(String centername) {
		Optional<DiagnosticCenter> optional=centerDao.findByName(centername);
		DiagnosticCenter centerName=optional.orElseThrow(()->new CenterNotFoundException("Center Not Exists"));
		return centerName;
		
	}

	@Override
	public void removeDiagnosticCenter(int id) {
	   DiagnosticCenter centerId= centerDao.findById(id).get();
	   centerDao.delete(centerId);

	}

	@Override
	public List<Appointment> getListOfAppointments(String centerName) {
		// TODO Auto-generated method stub
		return centerDao.findAllCenter(centerName);
		
		
	}

}