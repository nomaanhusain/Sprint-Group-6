package com.healthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class DiagnosticTest {
	@Id
	@GeneratedValue
	private int testId;
	@ApiModelProperty(notes = "Test Name")
	private String testName;
	@ApiModelProperty(notes = "Price of Test")
	private double testPrice;
	@ApiModelProperty(notes = "Normal Value of Test")
	private String normalValue;
	@ApiModelProperty(notes = "Units")
	private String units;

	@ApiModelProperty(notes = "Relation to Diagnostic Center")
	@OneToMany(fetch=FetchType.EAGER,targetEntity = DiagnosticCenter.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "test_id", referencedColumnName = "testId")
	private Set<DiagnosticCenter> diagnosticCenter;
	
	
}