package com.healthCare.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthCare.model.Appointment;
import com.healthCare.model.DiagnosticCenter;
import com.healthCare.model.DiagnosticTest;

@Repository
public interface DiagnosticCenterDAO extends JpaRepository<DiagnosticCenter,Integer> {

	public Optional<DiagnosticCenter> findByName(String centername);

	public Optional<DiagnosticTest> findByTestDetails(int diagnosticCenterId, String testName);

	public DiagnosticTest saveByCenterId(int diagnosticcenterId, int testId);

	
	




} 


