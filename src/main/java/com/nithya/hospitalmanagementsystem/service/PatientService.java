package com.nithya.hospitalmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithya.hospitalmanagementsystem.model.Patient;
import com.nithya.hospitalmanagementsystem.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired 
	PatientRepository patientRepository;

	public List<Patient> getPatients() {
		return patientRepository.findAll();
	}
	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}
}
