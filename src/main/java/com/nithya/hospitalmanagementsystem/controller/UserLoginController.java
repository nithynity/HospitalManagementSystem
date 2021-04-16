package com.nithya.hospitalmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nithya.hospitalmanagementsystem.model.Authentication;
import com.nithya.hospitalmanagementsystem.service.UserLoginService;

@RestController
@RequestMapping("/hospitalsystem/")
public class UserLoginController {

	@Autowired
	UserLoginService userLoginService;

	@CrossOrigin
	@GetMapping("/authentication/{userName}/{password}")
	public Authentication isAuthenticate(
			@PathVariable String userName,
			@PathVariable String password,
			@RequestParam int userType) {
		System.out.println("username is"+userName);
		System.out.println("password is"+password);
		boolean isAuthentication =userLoginService.isAuthentication(userName,password,userType);
		return new Authentication(isAuthentication);	
	}


}
