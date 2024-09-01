package com.patientregistration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patientregistration.model.Patient;



@Service
public interface PatientService {

	public Patient savePatientDetails(Patient patient);
	public Patient updatePatientDetails(int id,Patient patient);
	public void deletePatient(int id);
	public Patient findByPatientId(int id);
	public List<Patient> findAllPatients();
}
