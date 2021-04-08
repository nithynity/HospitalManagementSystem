package com.nithya.hospitalmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_type")
public class UserType {
	
	@Id
	@GeneratedValue
	@Column(name="user_type_id")
	public int userTypeId;
	
	@Column(name="user_type")
	public String userType;
	
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	
	@Override
	public String toString() {
		return "UserType [userTypeId=" + userTypeId + ", userType=" + userType + "]";
	}
}
