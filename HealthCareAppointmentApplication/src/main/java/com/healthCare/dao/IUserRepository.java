package com.healthCare.dao;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthCare.exception.UsernameNotFoundException;
import com.healthCare.model.Users;
import com.healthCare.security.StringEncrypter;

@Repository
public class IUserRepository {
	@Autowired
	private UserRepository usersRepo;
	
	public Users validateUsers(String Usersname,String password) {
		StringEncrypter encrypt=new StringEncrypter();
		List<Users> list=usersRepo.findAll();
		for(Users u:list) {
			if(u.getUsername().equals(Usersname)) {
				String decryptedpass=encrypt.decrypt(u.getPassword());
				if(decryptedpass.equals(password)) {
					return u;
				}
			}
		}
		return null;
	}
	public Users addUsers(Users users) {
		Users u=usersRepo.save(users);
		return users;
	}
	public Users removeUsers(Users users) {
		StringEncrypter encrypt = new StringEncrypter();
		users.setPassword(encrypt.encrypt(users.getPassword()));
		Optional<Users> u=usersRepo.findById(users.getUsersId());
		Users user=null;
		try {
		user=u.get();
		}catch(NoSuchElementException e) {
			throw new UsernameNotFoundException("User Not Found");
		}
		
		
		usersRepo.delete(user);
		return user;
	}
}
