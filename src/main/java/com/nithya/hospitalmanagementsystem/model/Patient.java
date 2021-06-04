package com.nithya.hospitalmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="patient")
public class Patient {
	
	@GeneratedValue
	@Id
	@Column(name="patient_number")
	public int patientNumber;
	@Column(name="patient_name")
	public String patientName;
	@Column(name="phone_number")
	public String phoneNumber;
	@Column(name="address")
	public String address;
	@Override
	public String toString() {
		return "Patient [patientNumber=" + patientNumber + ", patientName=" + patientName + ", phoneNumber="
				+ phoneNumber + ", address=" + address + "]";
	}
	public int getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(int patientNumber) {
		this.patientNumber = patientNumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
