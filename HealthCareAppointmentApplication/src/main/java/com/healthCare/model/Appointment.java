package com.healthCare.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {
	
	@Id
	@GeneratedValue
	private int id;
	private Date appointmentDate;
	private boolean approvalStatus;
	private Set<DiagnosticTest> diagnosticTests;
	private Patient patient;
	private DiagnosticCenter diagnosticCenter;
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
}
