package com.healthCare.service;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.IUserRepository;
import com.healthCare.dao.UserRepository;
import com.healthCare.exception.UsernameNotFoundException;
import com.healthCare.model.Users;
import com.healthCare.security.StringEncrypter;

@Service
public class IUserServiceImpl implements IUserService {
	//Log4j Implementation
	static Logger log = Logger.getLogger(IUserServiceImpl.class);
	static private PatternLayout patternLayout;
	private static FileAppender fileAppender;
	static {
		patternLayout = new PatternLayout("%d ## %M ##* %p ##* %m ## %L %n");
		try {
			fileAppender = new FileAppender(patternLayout, "mylogs.log");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.addAppender(fileAppender);
	}
	
	
	@Autowired
	private IUserRepository userRep;
	
	//Validate if a user exists
	@Override
	public Users validateUser(String username, String password) {

		Users user = userRep.validateUsers(username, password);
		if (user == null) {
			log.error("User Not Found");
			throw new UsernameNotFoundException("User Not Found");
		}

		return user;
	}
	//Add a new user
	@Override
	public Users addUser(Users user) {
		Users u = userRep.addUsers(user);
		log.info("User Added");
		return u;
	}
	//Remove a User
	@Override
	public Users removeUser(Users user) {
		Users u = userRep.removeUsers(user);
		log.info("User Removed");
		return user;
	}

}
