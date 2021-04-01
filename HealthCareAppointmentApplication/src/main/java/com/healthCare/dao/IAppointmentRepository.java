package com.healthCare.dao;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.healthCare.exception.ApointmentNotFoundException;
import com.healthCare.model.Appointment;


@Repository
public class IAppointmentRepository {
	
	static Logger log = Logger.getLogger(ITestResultRepository.class);
	static private PatternLayout patternLayout;
	private static FileAppender fileAppender;
	static {
		patternLayout = new PatternLayout("%d ## %M ##* %p ##* %m ## %L %n");
		try {
			fileAppender = new FileAppender(patternLayout, "mylogs.log");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.addAppender(fileAppender);
	}
	
	@Autowired
	private AppointmentDAO appointment;
	@Autowired
	private PatientDAO patient;
	
	public Appointment addAppointment(Appointment app) {
		Appointment appointment1 = appointment.save(app);
		log.info("Appointment Added");
		return appointment1;	
	}
	
	
	public Set<Appointment> viewAppointments(String patientName) {
		Optional<Integer> patientId=patient.findId(patientName);
		Optional<Set<Appointment>> optional=appointment.findAppointmentByName(patientId.get());	
		return optional.get();
	}
	
	public Appointment viewAppointment(int appointmentId) {
		Optional<Appointment> optional = appointment.findAppointmentById(appointmentId);
		Appointment appo=optional.orElseThrow(()->new ApointmentNotFoundException("Appointment Not Exists"));
		return appo;
	}
	
	public Appointment updateAppointment(Appointment app) {
		Appointment appointment1 = appointment.save(app);
		log.info("Appointment Updated");
		return appointment1;
	}
	
	//not complete
	public List<Appointment> getAppointmentList(int centreId, String test, int status) {
		
		return null;
	}
	
	public Appointment removeAppointment(Appointment appo) {
		appointment.delete(appo);
		log.info("Appointment remove");
		return appo;
	}
}