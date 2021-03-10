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
	private Date appointmentDate;
	private boolean approvalStatus;
	
	@OneToMany(mappedBy = "appointment", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<DiagnosticTest> diagnosticTests;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patientId")
	private Patient patient;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "centerId")
	private DiagnosticCenter diagnosticCenter;
	
	@OneToMany(mappedBy = "appointment", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<TestResult> testResult;
	
	
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public void setApprovalStatus(boolean approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public Set<DiagnosticTest> getDiagnosticTests() {
		return diagnosticTests;
	}
	public void setDiagnosticTests(Set<DiagnosticTest> diagnosticTests) {
		this.diagnosticTests = diagnosticTests;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}
	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}
	public Set<TestResult> getTestResult() {
		return testResult;
	}
	public void setTestResult(Set<TestResult> testResult) {
		this.testResult = testResult;
	}
	public boolean getApprovalStatus() {
		// TODO Auto-generated method stub
		return approvalStatus;
	}
}
