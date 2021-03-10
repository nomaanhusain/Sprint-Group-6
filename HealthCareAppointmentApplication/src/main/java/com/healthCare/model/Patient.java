package com.healthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="patient")
public class Patient {

	@Id
	@GeneratedValue
	private int patientId;
	private String name;
	private String phoneNo;
	private int age;
	private String gender;
	@OneToMany(mappedBy = "patient", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	Set<Appointment> appointment;
		
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Set<Appointment> getAppointment() {
		return appointment;
	}
	public void setAppointment(Set<Appointment> appointment) {
		this.appointment = appointment;
	}
}
