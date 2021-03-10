package com.healthCare.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthCare.model.Appointment;
import com.healthCare.model.DiagnosticCenter;
@Repository
public interface IDiagnosticCenterRepository extends JpaRepository<DiagnosticCenter,Integer> {

	Optional<DiagnosticCenter> findByName(String centername);

	List<Appointment> findAllCenter(String centerName);


	

	
}