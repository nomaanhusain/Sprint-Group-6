package com.healthCare.model;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Diagnostic_Centers")
public class DiagnosticCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //primary key generation automatically according to database.
	//@Column(name = "CENTER_ID", unique = true, nullable = false, length = 100)
	private int centerId;
	@ApiModelProperty(notes = "Center Name")
	//@Column(name = "CENTER_NAME", unique = true, nullable = false, length = 100)
	private String name;
	@ApiModelProperty(notes = "Center's Contact Number")
	//@Column(name = "CONTACT_NUMBER", unique = true, nullable = false, length = 10)
	private String contactNo;
	@ApiModelProperty(notes = "Center's Address")
	//@Column(name = "ADDRESS_NUMBER", unique = false, nullable = false, length = 100)
	private String address;
	@ApiModelProperty(notes = "Center's Email Address")
	//@Column(name = "EMAIL_ADDRESS", unique = true, nullable = false, length = 100)
	private String contactEmail;
	
	@ElementCollection(targetClass=String.class)
	private List<String> servicesOffered;
	
	@ApiModelProperty(notes = "Relation to Diagnostic Test")
	@OneToMany(fetch=FetchType.EAGER,targetEntity = DiagnosticTest.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "center_id", referencedColumnName = "centerId")
	private Set<DiagnosticTest> tests;



}