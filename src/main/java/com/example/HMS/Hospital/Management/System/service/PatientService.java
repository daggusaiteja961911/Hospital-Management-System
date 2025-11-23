package com.example.HMS.Hospital.Management.System.service;

import com.example.HMS.Hospital.Management.System.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Patient> getAllPatients() {
        try{
            // Logic to retrieve all patients
            System.out.println("Fetching all patients from service");
            return null;
        } catch (Exception e) {
            System.out.println("Error fetching all patients: " + e.getMessage());
            logger.error("Error fetching all patients : {}", e.getMessage());
            throw e;
        }
    }
    public Patient createPatient(Patient patient) {
        try{
            // Logic to create a new patient
            System.out.println("Creating a new patient");
            return patient;
        } catch (Exception e) {
            System.out.println("Error creating a new patient: " + e.getMessage());
            logger.error("Error creating a new patient : {}", e.getMessage());
            throw e;
        }
    }
    public Patient getPatientById(Long id) {
        try {
            // Logic to retrieve a patient by ID
            System.out.println("Fetching patient with ID: " + id);
            return null;
        } catch (Exception e) {
            System.out.println("Error fetching patient with ID " + id + ": " + e.getMessage());
            logger.error("Error fetching patient with ID {} : {}", id, e.getMessage());
            throw e;
        }
    }

    public void deletePatient(Long id) {
        try {
            // Logic to delete a patient by ID
            System.out.println("Deleting patient with ID: " + id);
        } catch (Exception e) {
            System.out.println("Error deleting patient with ID " + id + ": " + e.getMessage());
            logger.error("Error deleting patient with ID {} : {}", id, e.getMessage());
            throw e;
        }
    }

    public Patient updatePatient(Long id, Patient patient) {
        try {
            // Logic to update a patient by ID
            System.out.println("Updating patient with ID: " + id);
            return patient;
        } catch (Exception e) {
            System.out.println("Error updating patient with ID " + id + ": " + e.getMessage());
            logger.error("Error updating patient with ID {} : {}", id, e.getMessage());
            throw e;
        }
    }
}
