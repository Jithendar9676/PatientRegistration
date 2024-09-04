package com.patientregistration.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patientregistration.model.Patient;
import com.patientregistration.repository.PatientRepository;
import com.patientregistration.service.PatientService;
@Service
public class PatientServiceImp implements PatientService{

	@Autowired
	private PatientRepository patientRepository;
	@Override
	public Patient savePatientDetails(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public Patient updatePatientDetails(int id, Patient patient) {
		Patient exitingPatient=patientRepository.findById(patient.getId()).get();
		Patient updatedPatient=exitingPatient;
		updatedPatient.setName(patient.getName());
		updatedPatient.setContact(patient.getContact());
		updatedPatient.setAddress(patient.getAddress());
		updatedPatient.setDetails(patient.getDetails());
		return patientRepository.save(updatedPatient);
	}

	@Override
	public void deletePatient(int id) {
		Patient exitingPatient=patientRepository.findById(id).get();
		patientRepository.delete(exitingPatient);
	}

	@Override
	public Patient findByPatientId(int id) {
		
		return patientRepository.findById(id).get();
	}

	@Override
	public List<Patient> findAllPatients() {
		
		return patientRepository.findAll();
	}

}
