package com.healthCare.service;

import com.healthCare.model.User;

public interface IUserService {
	public User validateUser(String username, String password);
	public User addUser(User user);
	public User removeUser(User user);
}
