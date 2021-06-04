package com.nithya.hospitalmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nithya.hospitalmanagementsystem.model.Patient;
import com.nithya.hospitalmanagementsystem.service.PatientService;

@RestController
@RequestMapping("/patient/")
public class PatientController {

	@Autowired 
	PatientService patientService;

	@CrossOrigin
	@GetMapping("/getPatients")
	public List<Patient> getPatients() {
		return  patientService.getPatients();
	}

	@CrossOrigin
	@PostMapping("/")
	@ResponseBody
	public Patient addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
}
