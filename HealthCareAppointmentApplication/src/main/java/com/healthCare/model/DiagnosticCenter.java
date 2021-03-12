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

		 @ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
		 @JoinTable(name="test_offered",joinColumns= {@JoinColumn(name="center_id")},inverseJoinColumns= {@JoinColumn(name="test_id")})
	    private Set<DiagnosticTest> tests=new HashSet<>();


	 
}