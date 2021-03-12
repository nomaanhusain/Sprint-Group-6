package com.healthCare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.IUserRepository;
import com.healthCare.dao.UserRepository;
import com.healthCare.exception.InvalidUsernameException;
import com.healthCare.model.Users;

@Service
public class ILoginServiceImpl implements ILoginService {
	@Autowired
	private IUserRepository loginRepository;

	@Override
	public Users login(Users user) {
		Users username = loginRepository.validateUsers(user.getUsername(), user.getPassword());

		if (username == null) {
			throw new InvalidUsernameException(
					"The username or password that you've entered doesn't match to any account");

		}

		return username;
	}

	@Override
	public Users logout(Users user) {
		// TODO Auto-generated method stub
		Users username = loginRepository.validateUsers(user.getUsername(), user.getPassword());

		if (username == null) {
			throw new InvalidUsernameException(
					"The username or password that you've entered doesn't match to any account");

		}
		return username;
	}
}
