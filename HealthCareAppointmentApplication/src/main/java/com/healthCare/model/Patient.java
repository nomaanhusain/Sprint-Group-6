package com.healthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	@ApiModelProperty(notes = "patient name")
	private String name;
	@ApiModelProperty(notes = "patient number")
	private String phoneNo;
	@ApiModelProperty(notes = "patient age")
	private int age;
	@ApiModelProperty(notes = "patient gender")
	private String gender;
	
	@OneToMany(cascade = CascadeType.ALL)
	@ApiModelProperty(notes = "Relation with Appointment class")
	private Set<Appointment> appointment;	
}
