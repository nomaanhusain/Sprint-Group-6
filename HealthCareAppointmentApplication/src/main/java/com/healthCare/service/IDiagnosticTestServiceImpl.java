package com.healthCare.service;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.IDiagnosticTestRepository;
import com.healthCare.model.DiagnosticTest;

@Service
public class IDiagnosticTestServiceImpl implements IDiagnosticTestService {
	static Logger log = Logger.getLogger(IUserServiceImpl.class);
	static private PatternLayout patternLayout;
	private static FileAppender fileAppender;
	static {
		patternLayout = new PatternLayout("%d ## %M ##* %p ##* %m ## %L ");
		try {
			fileAppender = new FileAppender(patternLayout, "mylogs.log");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.addAppender(fileAppender);
	}
	@Autowired
	private IDiagnosticTestRepository diagnosticRep;
	@Override
	public DiagnosticTest addNewTest(DiagnosticTest test) {
		DiagnosticTest dig= diagnosticRep.addNewTest(test);
		log.info("Test Added");
		return dig;
	}

	@Override
	public List<DiagnosticTest> getAllTest() {
		List<DiagnosticTest> list=diagnosticRep.getAllTest();
		return list;
	}

	@Override
	public List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId) {
		List<DiagnosticTest> list=diagnosticRep.getTestsOfDiagnosticCenter(centerId);
		return list;
	}

	@Override
	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test) {
		DiagnosticTest dig=diagnosticRep.removeTestFromDiagnosticCenter(centerId, test);
		log.info("Test Removed");
		return dig;
	}

	@Override
	public DiagnosticTest updateTestDetail(DiagnosticTest test) {
		DiagnosticTest dig = diagnosticRep.updateTestDetail(test);
		log.info("Test Updated");
		return dig;
	}
}
