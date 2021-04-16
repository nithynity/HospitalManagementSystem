package com.nithya.HospitalManagementSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nithya.hospitalmanagementsystem.controller.UserLoginController;
import com.nithya.hospitalmanagementsystem.controller.UserTypeController;
import com.nithya.hospitalmanagementsystem.model.UserLogin;
import com.nithya.hospitalmanagementsystem.model.UserType;

@SpringBootTest
class HospitalManagementSystemApplicationTests {
	private static final Log logger = LogFactory.getLog(HospitalManagementSystemApplicationTests.class);
	@Autowired
	UserTypeController userTypeController;
	@Autowired
	UserLoginController userLoginController;
	
	@Test
	public void getUsers() {
		UserType userType = new UserType();
		userType.setUserTypeId(1);
		assertEquals(true, userLoginController.isAuthenticate("Nithya","123456",1));
	}
	

}
