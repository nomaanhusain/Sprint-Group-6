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
	@JoinColumn(name="test_id",referencedColumnName="testId")
	private Set<DiagnosticCenter> diagnosticCenter;
	
	
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public double getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}
	public String getNormalValue() {
		return normalValue;
	}
	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public Set<DiagnosticCenter> getDiagnosticCenter() {
		return diagnosticCenter;
	}
	public void setDiagnosticCenter(Set<DiagnosticCenter> diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}
}