package com.healthCare.dao;

import org.springframework.stereotype.Repository;
import com.healthCare.model.User;

@Repository
public interface IUserRepository {
	public User validateUser(String username, String password);
	public User addUser(User user);
	public User removeUser(User user);
}
