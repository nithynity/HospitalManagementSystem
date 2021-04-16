package com.nithya.hospitalmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

@ManyToOne
@JoinColumn(name="user_role", updatable=false, nullable=false)
public UserType userRole;


public UserType getUserRole() {
	return userRole;
}

public void setUserRole(UserType userRole) {
	this.userRole = userRole;
}

public int getUserId() {
	return userId;
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



@Override
public String toString() {
	return "UserLoginRepository [userId=" + userId + ", userName=" + userName + ", password=" + password + ", userRole="
			+ userRole + "]";
}



}
