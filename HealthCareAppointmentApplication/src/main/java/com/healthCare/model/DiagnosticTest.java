package com.healthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToMany;
=======
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
>>>>>>> branch 'master' of https://github.com/nomaanhusain/Sprint-Group-6.git

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
<<<<<<< HEAD
	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "tests")
=======
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="testCenter_id",referencedColumnName="centerId")
>>>>>>> branch 'master' of https://github.com/nomaanhusain/Sprint-Group-6.git
	private Set<DiagnosticCenter> diagnosticCenter;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="appointment_Id",referencedColumnName="appointmentId")
	private Appointment appointment;
	
	
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