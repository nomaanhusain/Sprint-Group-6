package com.healthCare.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment {
	
	@Id
	@GeneratedValue
	private int appointmentId;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date appointmentDate;
	
	private boolean approvalStatus;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = DiagnosticTest.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "appointment_id", referencedColumnName = "appointmentId")
	private Set<DiagnosticTest> diagnosticTests;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id",referencedColumnName="patientId")
	private Patient patient;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "center_id", referencedColumnName="centerId")
	private DiagnosticCenter diagnosticCenter;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = TestResult.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "appointment_no", referencedColumnName = "appointmentId")
	private Set<TestResult> testResult;

}
