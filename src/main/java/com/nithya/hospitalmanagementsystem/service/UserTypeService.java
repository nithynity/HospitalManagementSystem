package com.nithya.hospitalmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithya.hospitalmanagementsystem.model.UserType;
import com.nithya.hospitalmanagementsystem.repository.UserTypeRepository;
 
@Service
public class UserTypeService {
	
@Autowired	
UserTypeRepository userTypeRepository;
	
	public List<UserType> getAllUsers(){
		System.out.println(userTypeRepository.findAll());
		return userTypeRepository.findAll();	
	}

}
