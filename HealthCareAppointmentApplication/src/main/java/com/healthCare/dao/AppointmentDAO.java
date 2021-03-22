package com.healthCare.dao;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.healthCare.model.Appointment;

public interface AppointmentDAO extends JpaRepository<Appointment,Integer> {

	@Query("select a from Appointment a, Patient p where p.patientId=?1")
	Optional<Set<Appointment>> findAppointmentByName(Integer patient_id);
	
	@Query("select a from Appointment a, Patient p where p.patientId=?1")
	Optional<Appointment> findAppointmentById(Integer patient_id);

	
}