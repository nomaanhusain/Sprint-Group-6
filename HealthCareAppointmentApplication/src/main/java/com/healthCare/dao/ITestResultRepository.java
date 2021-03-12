package com.healthCare.dao;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthCare.exception.TestResultNotFoundException;
import com.healthCare.model.Patient;
import com.healthCare.model.TestResult;


@Repository
public class ITestResultRepository {
	@Autowired
	public TestResultDAO testResultDao;

	public TestResult addTestResult(TestResult tr) {
		TestResult t = testResultDao.save(tr);
		return t;
	}

	public TestResult updateTestResult(TestResult tr) {
		return null;
	}

	public TestResult removeTestResult(int id) {
		Optional<TestResult> op=testResultDao.findById(id);
		
		TestResult tr= (TestResult) op.orElseThrow(()-> new TestResultNotFoundException("Test Result Does Not Exists"));
		testResultDao.delete(tr);
		return tr;
	}
	public Set<TestResult> viewResultsByPatientId(int patientId){
		Set<TestResult> set=testResultDao.findAllByPatientId(patientId);
		return set;
	}
}
