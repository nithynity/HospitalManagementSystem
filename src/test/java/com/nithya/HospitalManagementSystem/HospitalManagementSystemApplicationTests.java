package com.nithya.HospitalManagementSystem;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nithya.hospitalmanagementsystem.controller.UserTypeController;
import com.nithya.hospitalmanagementsystem.model.UserType;

@SpringBootTest
class HospitalManagementSystemApplicationTests {
	private static final Log logger = LogFactory.getLog(HospitalManagementSystemApplicationTests.class);
	@Autowired
	UserTypeController userTypeController;
	
	@Test
	public void getUsers() {
		List<UserType>  users=userTypeController.getAllUsers();
	}

}
