package com.healthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCare.dao.IAdminRepository;
import com.healthCare.model.Users;

@Service
public class IAdminServiceImpl implements IAdminService {
	@Autowired
	private IAdminRepository adminRep;
	public void registerAdmin(String username, String password) {
		adminRep.registerAdmin(username, password);
	}
}
