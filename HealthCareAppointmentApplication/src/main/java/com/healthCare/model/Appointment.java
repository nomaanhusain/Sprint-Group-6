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
<<<<<<< HEAD
//	private Set<TestResult> testResult;
	
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public Date getAppointmentDate() {
//		return appointmentDate;
//	}
//	public void setAppointmentDate(Date appointmentDate) {
//		this.appointmentDate = appointmentDate;
//	}
//	public boolean isApprovalStatus() {
//		return approvalStatus;
//	}
//	public void setApprovalStatus(boolean approvalStatus) {
//		this.approvalStatus = approvalStatus;
//	}
//	public Set<DiagnosticTest> getDiagnosticTests() {
//		return diagnosticTests;
//	}
//	public void setDiagnosticTests(Set<DiagnosticTest> diagnosticTests) {
//		this.diagnosticTests = diagnosticTests;
//	}
//	public Patient getPatient() {
//		return patient;
//	}
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}
//	public DiagnosticCenter getDiagnosticCenter() {
//		return diagnosticCenter;
//	}
//	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
//		this.diagnosticCenter = diagnosticCenter;
//	}
//	public Set<TestResult> getTestResult() {
//		return testResult;
//	}
//	public void setTestResult(Set<TestResult> testResult) {
//		this.testResult = testResult;
//	}
=======
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = TestResult.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "appointment_no", referencedColumnName = "appointmentId")
	private Set<TestResult> testResult;

>>>>>>> branch 'master' of https://github.com/nomaanhusain/Sprint-Group-6.git
}
