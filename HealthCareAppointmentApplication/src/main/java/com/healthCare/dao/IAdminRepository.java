package com.healthCare.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository {
	public void registerAdmin(String username, String password);
}
