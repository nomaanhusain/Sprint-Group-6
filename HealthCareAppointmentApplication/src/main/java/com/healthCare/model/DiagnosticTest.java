package com.healthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class DiagnosticTest {
	@Id
	@GeneratedValue
	private int testId;
	private String testName;
	private double testPrice;
	private String normalValue;
	private String units;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id",referencedColumnName = "testId")
	private Set<DiagnosticCenter> diagnosticCenter;
}
