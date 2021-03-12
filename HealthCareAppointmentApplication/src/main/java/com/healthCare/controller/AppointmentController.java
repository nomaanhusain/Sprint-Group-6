package com.healthCare.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthCare.model.Appointment;
import com.healthCare.service.IAppointmentServiceImpl;


@RestController
@RequestMapping(value = "/hcac")	//hcac = health care appointment controller
public class AppointmentController{

	@Autowired
	private  IAppointmentServiceImpl aservice;
	
	
	//working
	@PostMapping(value = "/addAppointment")
	public ResponseEntity<String> addAppointment(@RequestBody Appointment appo) {
		Appointment appo1= aservice.addAppointment(appo);
		return new ResponseEntity<String>("Appointment with ID :" + appo1.getAppointmentId()+ " created Successfully", HttpStatus.CREATED);
	}
	
	//not working
	@GetMapping(value="/viewAppointments/{patientName}")
	public ResponseEntity<Set<Appointment>> viewAppointments(@PathVariable String patientName)
	{
		Set<Appointment> appo=aservice.viewAppointments(patientName);
		return new ResponseEntity<Set<Appointment>>(appo,HttpStatus.OK);
	}

	
	//not working
	@GetMapping(value="/viewAppointment/{patientId}")
	public ResponseEntity<Appointment> viewAppointment(@PathVariable int patientId)
	{
		Appointment appo=aservice.viewAppointment(patientId);
		return new ResponseEntity<Appointment>(appo,HttpStatus.OK);
	}
	
	//working
	@PutMapping(value = "/updateAppointment/{aid}")
	public ResponseEntity<Appointment> updateAppointment(@PathVariable int aid,@RequestBody Appointment appo)
	{
		Appointment appointment=aservice.viewAppointment(aid);
		appointment.setAppointmentDate(appo.getAppointmentDate());
		appointment.setApprovalStatus(appo.isApprovalStatus());
		appointment.setDiagnosticCenter(appo.getDiagnosticCenter());
		appointment.setPatient(appo.getPatient());
		appointment.setDiagnosticTests(appo.getDiagnosticTests());
		appointment.setTestResult(appo.getTestResult());
		aservice.addAppointment(appointment);
		return new ResponseEntity<Appointment>(appointment,HttpStatus.OK);
	}
	
	
	//not working
	@GetMapping(value="/getAppointmentList/{centerid},{test},{status}")
	public ResponseEntity<List<Appointment>> getAppointmentList(@PathVariable int centreId, String test, int status)
	{
		List<Appointment> appo=aservice.getAppointmentList(centreId ,test ,status);
		return new ResponseEntity<List<Appointment>>(appo,HttpStatus.OK);
	}
	
	
	//working
	@DeleteMapping(value = "/removeAppointment")
	public ResponseEntity<String> removeAppointment(@RequestBody Appointment appo)
	{
		aservice.removeAppointment(appo);
		return new ResponseEntity<String>("Appointment With ID :" + appo.getAppointmentId() + " Deleted Successfully", HttpStatus.OK);
	}
}