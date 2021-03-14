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
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestResult {
	@Id
	@GeneratedValue
	private int testResultId;
	@ApiModelProperty(notes = "Test Reading")
	private double testReading;
	@ApiModelProperty(notes = "Condition")
	private String condition;
	@ApiModelProperty(notes = "Appointment Object")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="appointment_id", referencedColumnName = "appointment_id")
	private Appointment appointment;
	

}
