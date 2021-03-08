package com.healthCare.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class DiagnosticTest {
	@Id
	@GeneratedValue
	private int id;
	private String testName;
	private double testPrice;
	private String normalValue;
	private String units;
	private Set<DiagnosticCenter> diagnosticCenter;
}
