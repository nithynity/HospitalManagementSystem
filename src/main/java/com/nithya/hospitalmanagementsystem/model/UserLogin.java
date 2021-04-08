package com.nithya.hospitalmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="user_login")
public class UserLogin {
	
@Id
@GeneratedValue
@Column(name="user_id")
public int userId;

@Column(name="username")
public String userName;

@Column(name="password")
public String password;

@Column(name="user_role")
public int userRole;

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getUserRole() {
	return userRole;
}

public void setUserRole(int userRole) {
	this.userRole = userRole;
}

@Override
public String toString() {
	return "UserLoginRepository [userId=" + userId + ", userName=" + userName + ", password=" + password + ", userRole="
			+ userRole + "]";
}



}
