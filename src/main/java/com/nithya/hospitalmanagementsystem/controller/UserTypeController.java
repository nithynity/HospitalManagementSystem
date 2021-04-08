package com.nithya.hospitalmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nithya.hospitalmanagementsystem.model.UserType;
import com.nithya.hospitalmanagementsystem.service.UserTypeService;

@RestController
@RequestMapping("/hospitalsystem/")
public class UserTypeController {

	@Autowired
	UserTypeService userTypeService;

	@CrossOrigin
	@GetMapping("/userRole")
	public List<UserType> getAllUsers() {
		System.out.println("sankar: inside getAllUsers");
		return userTypeService.getAllUsers();
	}
}
