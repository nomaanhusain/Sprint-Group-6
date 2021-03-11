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

	Optional<DiagnosticCenter> findByName(String centername);

	DiagnosticCenter removeDiagnosticCenter(int id);

	List<Appointment> getListOfAppointments(String centerName);

	DiagnosticTest viewTestDetails(int diagnosticCenterId, String testName);

	DiagnosticTest addTest(int diagnosticcenterId, int testId);

	List<Appointment> findAllCenter(String centerName);

	

	
} 


