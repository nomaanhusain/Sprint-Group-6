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

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class DiagnosticTest {
	@Id
	@GeneratedValue
	private int testId;
	private String testName;
	private double testPrice;
	private String normalValue;
	private String units;

	
	@OneToMany(fetch=FetchType.EAGER,targetEntity = DiagnosticCenter.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "test_id", referencedColumnName = "testId")
	private Set<DiagnosticCenter> diagnosticCenter;
	
	
}