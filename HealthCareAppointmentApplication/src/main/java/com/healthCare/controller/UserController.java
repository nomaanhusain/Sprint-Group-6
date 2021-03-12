package com.healthCare.controller;



import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.healthCare.model.Users;
import com.healthCare.security.StringEncrypter;
import com.healthCare.service.IUserService;
import com.healthCare.dao.UserRepository;

 

@Controller
@RequestMapping(value = "/hcr")
public class UserController {
    @Autowired
    private IUserService userService;
     
   
    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody Users user) {
       // user.setPassword(encodedPassword);
    	StringEncrypter encrypt=new StringEncrypter();
		String encPass=encrypt.encrypt(user.getPassword());
		user.setPassword(encPass);
        userService.addUser(user);
         
        return new ResponseEntity<String>("Success",HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> removeUser(@RequestBody Users user){
    	StringEncrypter encrypt=new StringEncrypter();
		String dcpPass=encrypt.decrypt(user.getPassword());
		user.setPassword(dcpPass);
		userService.removeUser(user);
		return new ResponseEntity<String>("Removed",HttpStatus.OK);
    }
    
   
}