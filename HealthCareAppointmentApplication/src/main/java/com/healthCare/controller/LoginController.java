package com.healthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthCare.model.Users;
import com.healthCare.service.ILoginService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/login")
@Api(value = "Login", tags = { "Login" })
public class LoginController {
	@Autowired
	private ILoginService loginService;
	private boolean loginStatus = false;

	@GetMapping(value = "/loginuser")
	 @ApiOperation(value = "To Login a user")
	public ResponseEntity<String> validateLogin(@RequestBody Users user) {
		Users user1 = loginService.login(user);

		if (user1 != null) {
			loginStatus = true;
			return new ResponseEntity<String>("Login Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Login Failed, Please Try Again", HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/logout")
	@ApiOperation(value = "To Logout a user")
	public ResponseEntity<String> logout(@RequestBody Users user) {
		Users u=loginService.logout(user);
		if (loginStatus) {
			loginStatus = false;
			return new ResponseEntity<String>("Logged Out User "+u.getUsername(), HttpStatus.OK);
		}
		return new ResponseEntity<String>("Please Login First", HttpStatus.OK);
	}

}