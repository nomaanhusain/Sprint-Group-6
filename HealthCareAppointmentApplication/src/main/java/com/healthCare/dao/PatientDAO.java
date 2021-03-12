package com.healthCare.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.healthCare.model.*;

@Repository
public interface PatientDAO extends JpaRepository<Patient, Integer>
{
	
	  @Query("SELECT p FROM Patient p WHERE p.name = ?1") 
	  Optional<Patient> findByName(String patientName);
	 
}