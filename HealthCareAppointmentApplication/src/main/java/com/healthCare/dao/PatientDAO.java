package com.healthCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthCare.model.*;

public interface PatientDAO extends JpaRepository<Patient, Integer>
{

}
