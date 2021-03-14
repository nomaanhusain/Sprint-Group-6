package com.healthCare.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
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
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DiagnosticTest  {
	@Id
	@GeneratedValue
	private int testId;
	@ApiModelProperty(notes = "Test Name")
	private String testName;
	@ApiModelProperty(notes = "Test Price")
	private double testPrice;
	@ApiModelProperty(notes = "Normal Value of Test")
	private String normalValue;
	@ApiModelProperty(notes = "Unit of Measurement")
	private String units;

	
	//@ManyToOne(fetch=FetchType.EAGER,targetEntity = DiagnosticCenter.class, cascade = CascadeType.ALL)
	//@JoinColumn(name = "testId", referencedColumnName = "testId")
	//@ElementCollection(targetClass = DiagnosticCenter.class)
	//@ManyToMany(fetch=FetchType.EAGER,targetEntity = DiagnosticCenter.class, cascade = CascadeType.ALL)
	//@JoinColumn(name = "testId", referencedColumnName = "testId")
	//private Set<DiagnosticCenter> diagnosticCenter;
	
	@ManyToMany(cascade = CascadeType.ALL,targetEntity = DiagnosticCenter.class,fetch = FetchType.EAGER)
	@JoinColumn(name = "testId", referencedColumnName = "testId")
	private Set<DiagnosticCenter> diagnosticCenter;
}