package com.healthCare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthCare.model.DiagnosticTest;


public interface IDiagnosticTestRepository extends JpaRepository<DiagnosticTest, Integer>{
	public List<DiagnosticTest> findByCenterId(int centerId);
	public DiagnosticTest deleteByCenterId(int centerId);
	public List<DiagnosticTest> getAllTest();
	public DiagnosticTest addNewTest(DiagnosticTest test);
	public List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId);
	public DiagnosticTest updateTestDetail(DiagnosticTest test);
	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test);
}