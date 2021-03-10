package com.healthCare.model;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
<<<<<<< HEAD
import javax.persistence.Column;
=======
>>>>>>> branch 'master' of https://github.com/nomaanhusain/Sprint-Group-6.git
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
<<<<<<< HEAD
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
=======
import javax.persistence.ManyToMany;
>>>>>>> branch 'master' of https://github.com/nomaanhusain/Sprint-Group-6.git

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
<<<<<<< HEAD
		@GeneratedValue(strategy = GenerationType.IDENTITY) //primary key generation automatically according to database.
		@Column(name = "Center_id")
		private int id;
=======
		@GeneratedValue(strategy = GenerationType.AUTO) //primary key generation automatically according to database.
		private int centerId;
>>>>>>> branch 'master' of https://github.com/nomaanhusain/Sprint-Group-6.git
		private String name;
		private String contactNo;
		private String address;
		private String contactEmail;
		 @ElementCollection(targetClass=String.class)
		private List<String> servicesOffered;
<<<<<<< HEAD
		 @ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
		 @JoinTable(name="test_offered",
		 joinColumns = {@JoinColumn(name="center_id")},inverseJoinColumns = {@JoinColumn(name="test_id")})
	    private Set<DiagnosticTest> tests=new HashSet<>();

=======
		 @ManyToMany(cascade = CascadeType.ALL)
			@JoinColumn(name="center_id",referencedColumnName="centerId")
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
>>>>>>> branch 'master' of https://github.com/nomaanhusain/Sprint-Group-6.git
}