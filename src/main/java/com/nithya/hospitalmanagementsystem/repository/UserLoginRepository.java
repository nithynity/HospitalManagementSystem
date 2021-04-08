package com.nithya.hospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nithya.hospitalmanagementsystem.model.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin,Integer>{

}
