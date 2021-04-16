package com.nithya.hospitalmanagementsystem.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nithya.hospitalmanagementsystem.model.UserLogin;
import com.nithya.hospitalmanagementsystem.model.UserType;
@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin,Integer>{
	
	public Optional<UserLogin> findByUserNameAndPasswordAndUserRoleUserTypeId(String userName, String password, int userTypeId );

	

}
