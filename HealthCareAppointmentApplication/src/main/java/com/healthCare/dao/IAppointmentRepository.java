package com.healthCare.dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.healthCare.model.Appointment;

@Repository
public class IAppointmentRepository {
	
	@Autowired
	private AppointmentDAO appointment;
	
	public Appointment addAppointment(Appointment app) {
		Appointment appointment1 = appointment.save(app);
		return appointment1;	
	}
	
	public Set<Appointment> viewAppointments(String patientName) {
		
	}
	
	public Appointment viewAppointment(int appointmentId) {
		Optional<Appointment> optional = appointment.findById(appointmentId);
		Appointment appointment=null;
		if (optional.isPresent()) 
		{
			appointment = (Appointment) optional.get();
		}
		else
		{
			System.out.println("Appointment With ID :"+appointment + " not exist");
		}
		return appointment;	
	}
	
	public Appointment updateAppointment(Appointment appointment) {
		Appointment appointment1 = appointment.save(app);
		return appointment1;		
	}
	
	public List<Appointment> getAppointmentList(int centreId, String test, int status) {}
	
	public Appointment removeAppointment(Appointment appointment) {}
}
