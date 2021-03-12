package com.healthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.UserRepository;
import com.healthCare.exception.UsernameNotFoundException;
import com.healthCare.model.Users;
import com.healthCare.security.StringEncrypter;

@Service
public class IUserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userRep;
	@Override
	public Users validateUser(String username, String password) {
		StringEncrypter encrypt=new StringEncrypter();
		List<Users> list = userRep.findAll();
		for(Users u:list) {
			if(u.getUsername().equals(username)) {
				String decryptedpass=encrypt.decrypt(u.getPassword());
				if(decryptedpass.equals(password)) {
					return u;
				}
			}
		}
		throw new UsernameNotFoundException("User Not Found");
	}

	@Override
	public Users addUser(Users user) {
		Users u=userRep.save(user);
		return u;
	}

	@Override
	public Users removeUser(Users user) {
		userRep.delete(user);
		return user;
	}

}
