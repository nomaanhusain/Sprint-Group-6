package com.healthCare.dao;

import com.healthCare.model.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<Users, Integer> {
   // @Query("SELECT u FROM User u WHERE u.username = ?1")
    public Users findByUsername(String username); 
    public Users findByPassword(String password);
}
