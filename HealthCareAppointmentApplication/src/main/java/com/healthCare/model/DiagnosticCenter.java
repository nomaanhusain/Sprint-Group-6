package com.healthCare.model;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import javax.persistence.ManyToMany;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Entity
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Table(name="Diagnostic_Centers")
	public class DiagnosticCenter {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) //primary key generation automatically according to database.

		private int centerId;

		private String name;
		private String contactNo;
		private String address;
		private String contactEmail;
		 @ElementCollection(targetClass=String.class)
		private List<String> servicesOffered;

		 @ManyToMany(cascade=CascadeType.ALL)
		 @JoinColumn(name="test_offered",referencedColumnName="testId")
	    private Set<DiagnosticTest> tests=new HashSet<>();


	 
}