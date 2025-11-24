package com.example.HMS.Hospital.Management.System.repository;

import com.example.HMS.Hospital.Management.System.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
