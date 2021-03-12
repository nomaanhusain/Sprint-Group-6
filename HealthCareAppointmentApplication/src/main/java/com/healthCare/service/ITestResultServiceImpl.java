package com.healthCare.service;

import java.io.IOException;
import java.util.Set;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.ITestResultRepository;
import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;

@Service
public class ITestResultServiceImpl implements ITestResultService {
	//Log4j Implementation
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
	private ITestResultRepository testRep;

	@Override
	public TestResult addTestResult(TestResult tr) {
		// TODO Auto-generated method stub
		TestResult t= testRep.addTestResult(tr);
		log.info("Test Result Added");
		return t;
	}

	@Override
	public TestResult updateTestResult(TestResult tr) {
		TestResult t=testRep.updateTestResult(tr);
		log.info("Test Result Updated");
		return t;
	}

	@Override
	public TestResult removeTestResult(int testId) {
		TestResult tr=testRep.removeTestResult(testId);
		log.info("Test Result Removed");
		return tr;
	}

	@Override
	public Set<TestResult> viewResultsByPatientId(int patientId) {
		Set<TestResult> set=testRep.viewResultsByPatientId(patientId);
		return set;
	}
	

}
