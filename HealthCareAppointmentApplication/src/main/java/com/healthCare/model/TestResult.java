package com.healthCare.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class TestResult {
	@Id
	@GeneratedValue
	private int testResultId;
	private double testReading;
	private String condition;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="appointmentId",referencedColumnName = "testResultId")
	private Appointment appointment;
	
	
	public double getTestReading() {
		return testReading;
	}
	public void setTestReading(double testReading) {
		this.testReading = testReading;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
}