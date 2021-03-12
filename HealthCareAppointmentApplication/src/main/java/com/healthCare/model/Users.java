package com.healthCare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {
	@Id
	@GeneratedValue
	public int usersId;
	@ApiModelProperty(notes = "Username")
	public String username;
	@ApiModelProperty(notes = "password")
	public String password;
	@ApiModelProperty(notes = "role")
	public String role;
	
	
}
