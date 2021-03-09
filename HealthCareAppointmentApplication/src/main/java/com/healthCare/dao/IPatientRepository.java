package com.healthCare.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IPatientRepository {

	@Autowired
	private PatientDAO patient;
}
