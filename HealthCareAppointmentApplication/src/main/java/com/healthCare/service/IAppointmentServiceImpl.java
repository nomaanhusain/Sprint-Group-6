package com.healthCare.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.AppointmentDAO;
import com.healthCare.model.Appointment;

@Service
public class IAppointmentServiceImpl implements IAppointmentService {
	
	@Autowired
	private AppointmentDAO adao;

	@Override
	public Appointment addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Appointment> viewAppointments(String patientName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment viewAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAppointmentList(int centreId, String test, int status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment removeAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
