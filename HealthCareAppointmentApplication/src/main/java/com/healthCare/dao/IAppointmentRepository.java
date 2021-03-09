package com.healthCare.dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthCare.exception.ApointmentNotFoundException;
import com.healthCare.model.Appointment;
import com.healthCare.model.Patient;

@Repository
public class IAppointmentRepository {
	
	@Autowired
	private AppointmentDAO appointment;
	
	@Autowired
	private PatientDAO patient;
	
	public Appointment addAppointment(Appointment app) {
		Appointment appointment1 = appointment.save(app);
		return appointment1;	
	}
	
	//I don't have idea how to implement
	public Set<Appointment> viewAppointments(String patientName) {
		Optional<Patient> optional = patient.findByName(patientName);
		return optional.get().getAppointment();
	}
	
	public Appointment viewAppointment(int appointmentId) {
		Optional<Appointment> optional = appointment.findById(appointmentId);
		Appointment appo=optional.orElseThrow(()->new ApointmentNotFoundException("Appointment Not Exists"));
		return appo;
	}
	
	public Appointment updateAppointment(Appointment app) {
		Appointment appointment1 = appointment.save(app);
		return appointment1;
	}
		
	
	public List<Appointment> getAppointmentList(int centreId, String test, int status) {
		
		return null;
	}
	
	public Appointment removeAppointment(Appointment appo) {
		appointment.delete(appo);
		return appo;
	}
}
