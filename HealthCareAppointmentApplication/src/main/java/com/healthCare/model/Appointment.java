package com.healthCare.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
	@Column(name="appointment_id")
	private int appointmentId;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date appointmentDate;
	
	private boolean approvalStatus;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "appointment_diagnostictest", joinColumns = { @JoinColumn(name = "appointment_id") }, inverseJoinColumns = { @JoinColumn(name = "test_id")})
	private Set<DiagnosticTest> diagnosticTests;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id",referencedColumnName="patientId")
	private Patient patient;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "center_id", referencedColumnName="centerId")
	private DiagnosticCenter diagnosticCenter;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Appointment_testresult", joinColumns = { @JoinColumn(name = "appointment_id") }, inverseJoinColumns = { @JoinColumn(name = "testresult_id")})
	private Set<TestResult> testResult;
}