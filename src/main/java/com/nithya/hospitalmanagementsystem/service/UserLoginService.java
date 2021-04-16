package com.nithya.hospitalmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithya.hospitalmanagementsystem.model.UserLogin;
import com.nithya.hospitalmanagementsystem.model.UserType;
import com.nithya.hospitalmanagementsystem.repository.UserLoginRepository;

@Service
public class UserLoginService {

	@Autowired
	UserLoginRepository userLoginRepository;

	public  boolean isAuthentication(String userName, String password, int roleId) {
		boolean authenticated = userLoginRepository.findByUserNameAndPasswordAndUserRoleUserTypeId(userName, password, roleId).isPresent();
		return authenticated;
	}

}
