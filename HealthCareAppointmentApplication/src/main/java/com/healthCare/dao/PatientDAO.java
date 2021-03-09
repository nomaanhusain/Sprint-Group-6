package com.healthCare.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthCare.model.*;

public interface PatientDAO extends JpaRepository<Patient, Integer>
{
	Optional<Patient> findByName(String patientName);
	
}