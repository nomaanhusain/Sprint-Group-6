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
	@JoinColumn(name="appointment_id", referencedColumnName = "appointmentId")
	private Appointment appointment;
	

}
