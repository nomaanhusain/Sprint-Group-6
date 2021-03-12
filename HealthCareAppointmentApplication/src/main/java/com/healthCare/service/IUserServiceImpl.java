package com.healthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.IUserRepository;
import com.healthCare.dao.UserRepository;
import com.healthCare.exception.UsernameNotFoundException;
import com.healthCare.model.Users;
import com.healthCare.security.StringEncrypter;

@Service
public class IUserServiceImpl implements IUserService {
	@Autowired
	private IUserRepository userRep;
	@Override
	public Users validateUser(String username, String password) {

		Users user = userRep.validateUsers(username, password);
		if(user==null) {
		throw new UsernameNotFoundException("User Not Found");
		}
		
		return user;
	}

	@Override
	public Users addUser(Users user) {
		Users u=userRep.addUsers(user);
		return u;
	}

	@Override
	public Users removeUser(Users user) {
		Users u=userRep.removeUsers(user);
		
		return user;
	}

}
