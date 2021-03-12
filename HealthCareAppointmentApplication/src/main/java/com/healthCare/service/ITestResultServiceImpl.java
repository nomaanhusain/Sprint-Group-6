package com.healthCare.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.ITestResultRepository;
import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;

@Service
public class ITestResultServiceImpl implements ITestResultService {
	@Autowired
	private ITestResultRepository testRep;

	@Override
	public TestResult addTestResult(TestResult tr) {
		// TODO Auto-generated method stub
		TestResult t= testRep.addTestResult(tr);
		return t;
	}

	@Override
	public TestResult updateTestResult(TestResult tr) {
		TestResult t=testRep.updateTestResult(tr);
		return t;
	}

	@Override
	public TestResult removeTestResult(int testId) {
		TestResult tr=testRep.removeTestResult(testId);
		return tr;
	}

	@Override
	public Set<TestResult> viewResultsByPatientId(int patientId) {
		Set<TestResult> set=testRep.viewResultsByPatientId(patientId);
		return set;
	}
	

}
