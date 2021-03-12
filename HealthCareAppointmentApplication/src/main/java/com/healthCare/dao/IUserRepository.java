package com.healthCare.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
		
		usersRepo.delete(users);
		return users;
	}
}
