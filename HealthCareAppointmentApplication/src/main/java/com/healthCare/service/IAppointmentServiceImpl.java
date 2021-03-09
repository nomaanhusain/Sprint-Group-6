package com.healthCare.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.*;
import com.healthCare.model.Appointment;

@Service
public class IAppointmentServiceImpl implements IAppointmentService {
	
	@Autowired
	private IAppointmentRepository arepository;

	@Override
	public Appointment addAppointment(Appointment app) {
		Appointment appointment1 = arepository.addAppointment(app);
		return appointment1;	
	}

	public Set<Appointment> viewAppointments(String patientName) {
		return arepository.viewAppointments(patientName);
	}

	@Override
	public Appointment viewAppointment(int appointmentId) {
		return arepository.viewAppointment(appointmentId);
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		return arepository.updateAppointment(appointment);
	}

	@Override
	public List<Appointment> getAppointmentList(int centreId, String test, int status) {
		return arepository.getAppointmentList(centreId, test, status);
	}

	@Override
	public Appointment removeAppointment(Appointment appointment) {
		return arepository.removeAppointment(appointment);
	}
	
}
