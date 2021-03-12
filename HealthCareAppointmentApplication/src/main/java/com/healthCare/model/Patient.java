package com.healthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
	
	//@OneToMany(cascade = CascadeType.ALL, targetEntity = Appointment.class, fetch = FetchType.EAGER)
	//@JoinColumn(name = "patient_id", referencedColumnName = "patientId")

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "patient_appointment", joinColumns = { @JoinColumn(name = "patient_id") }, inverseJoinColumns = { @JoinColumn(name = "appointment_id")})
	private Set<Appointment> appointment;	
}
