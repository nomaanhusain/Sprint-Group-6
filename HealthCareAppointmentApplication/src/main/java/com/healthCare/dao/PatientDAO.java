package com.healthCare.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.healthCare.model.*;

public interface PatientDAO extends JpaRepository<Patient, Integer>
{
	@Query("SELECT p FROM Patient p WHERE p.name = ?1")
	Patient findByName(String patientName);
	
}