package com.userRegistration.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.userRegistration.model.User;
import com.userRegistration.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
