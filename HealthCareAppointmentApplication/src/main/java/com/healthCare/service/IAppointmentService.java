package com.healthCare.service;

import java.util.List;
import java.util.Set;

import com.healthCare.model.Appointment;

public interface IAppointmentService {

	public Appointment addAppointment(Appointment appointment);
	
	public Set<Appointment> viewAppointments(String patientName);
	
	public Appointment viewAppointment(int appointmentId);
	
	public Appointment updateAppointment(Appointment appointment);
	
	public List<Appointment> getAppointmentList(int centreId, String test, int status);
	
	public Appointment removeAppointment(Appointment appointment);
	
}
