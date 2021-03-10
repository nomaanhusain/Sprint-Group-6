package com.healthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "tests")
	private Set<DiagnosticCenter> diagnosticCenter;
}
