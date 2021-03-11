package com.healthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.healthCare.dao.IUserRepository;
import com.healthCare.model.User;

public class CustomUserDetailsService implements UserDetailsService {
 
    @Autowired
    private IUserRepository userRepo;
     
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return (UserDetails) new CustomUserDetails(user);
    }
 
}
