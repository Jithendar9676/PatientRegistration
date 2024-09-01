package com.patientregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientregistration.model.Patient;
import com.patientregistration.serviceimp.PatientServiceImp;


@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientServiceImp patientServiceImp;
	
	@PostMapping("/save")
	public Patient save(@RequestBody Patient patient) {
		return patientServiceImp.savePatientDetails(patient);
	}
	@PutMapping("/update/{id}")
	public Patient update(@PathVariable int id, @RequestBody Patient patient) {
		return patientServiceImp.updatePatientDetails(id, patient);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		patientServiceImp.deletePatient(id);
	}
	@GetMapping("/getPatient/{id}")
	public Patient findPatient(@PathVariable int id) {
		return patientServiceImp.findByPatientId(id);
	}
	
	@GetMapping("/getAllPatients")
	public List<Patient> findAllPatient(){
		return patientServiceImp.findAllPatients();
	}
}
