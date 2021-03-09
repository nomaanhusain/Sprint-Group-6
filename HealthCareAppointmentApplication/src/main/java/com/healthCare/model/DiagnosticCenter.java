package com.healthCare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DiagnosticCenter {
	@Id
	@GeneratedValue
	private int centerId;
}
