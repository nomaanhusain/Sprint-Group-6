package com.healthCare.service;

import com.healthCare.model.Users;

public interface IUserService {
	public Users validateUser(String username, String password);
	public Users addUser(Users user);
	public Users removeUser(Users user);
}
