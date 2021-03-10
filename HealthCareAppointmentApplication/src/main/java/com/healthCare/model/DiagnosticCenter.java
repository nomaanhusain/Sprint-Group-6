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
		private int centerId;
		private String name;
		private String contactNo;
		private String address;
		private String contactEmail;
		 @ElementCollection(targetClass=String.class)
		private List<String> servicesOffered;
	    private Set<DiagnosticTest> tests;
		public int getCenterId() {
			return centerId;
		}
		public void setCenterId(int centerId) {
			this.centerId = centerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContactNo() {
			return contactNo;
		}
		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContactEmail() {
			return contactEmail;
		}
		public void setContactEmail(String contactEmail) {
			this.contactEmail = contactEmail;
		}
		public List<String> getServicesOffered() {
			return servicesOffered;
		}
		public void setServicesOffered(List<String> servicesOffered) {
			this.servicesOffered = servicesOffered;
		}
		public Set<DiagnosticTest> getTests() {
			return tests;
		}
		public void setTests(Set<DiagnosticTest> tests) {
			this.tests = tests;
		}
	    
	    

}