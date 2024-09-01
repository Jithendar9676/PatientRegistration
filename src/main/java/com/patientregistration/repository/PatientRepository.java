package com.patientregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patientregistration.model.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
}
