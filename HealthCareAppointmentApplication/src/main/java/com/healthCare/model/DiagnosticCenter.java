package com.healthCare.model;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Entity
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class DiagnosticCenter {
		
	
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) //primary key generation automatically according to database.
		private int id;
		private String name;
		private String contactNo;
		private String address;
		private String contactEmail;
		 @ElementCollection(targetClass=String.class)
		private List<String> servicesOffered;
	    private Set<DiagnosticTest> tests;

}