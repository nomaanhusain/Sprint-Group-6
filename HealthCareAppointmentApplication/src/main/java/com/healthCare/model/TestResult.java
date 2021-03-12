package com.healthCare.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class TestResult {
	@Id
	@GeneratedValue
	private int testResultId;
	@ApiModelProperty(notes = "Test Reading")
	private double testReading;
	@ApiModelProperty(notes = "Current Condition")
	private String condition;
	@ApiModelProperty(notes = "Relation with Appointment")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="appointment_id", referencedColumnName = "appointmentId")
	private Appointment appointment;
	

}
