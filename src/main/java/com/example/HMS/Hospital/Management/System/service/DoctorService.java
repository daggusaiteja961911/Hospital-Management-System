package com.example.HMS.Hospital.Management.System.service;

import com.example.HMS.Hospital.Management.System.models.Doctor;
import com.example.HMS.Hospital.Management.System.repository.DoctorRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(DoctorService.class);

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        // Logic to retrieve all doctors from the database
        try {
            // Simulating database retrieval
            System.out.println("Retrieving all doctors from the database");
            return doctorRepository.findAll();
        } catch (Exception e) {
            // Handle exceptions appropriately
            logger.error("Error retrieving doctors: {}", e.getMessage());
            throw new RuntimeException("Error retrieving doctors", e);
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        // Logic to create a new doctor in the database
        try {
            // Simulating database insertion
            System.out.println("Creating a new doctor in the database");
            return doctorRepository.save(doctor);
        } catch (Exception e) {
            // Handle exceptions appropriately
            logger.error("Error creating doctor: {}", e.getMessage());
            throw new RuntimeException("Error creating doctor", e);
        }
    }

    public Doctor getDoctorById(Long id) {
        // Logic to retrieve a doctor by ID from the database
        try {
            // Simulating database retrieval
            System.out.println("Retrieving doctor with ID: " + id);
            return doctorRepository.findById(id).orElse(null);
        } catch (Exception e) {
            // Handle exceptions appropriately
            logger.error("Error retrieving doctor with ID {}: {}", id, e.getMessage());
            throw new RuntimeException("Error retrieving doctor with ID: " + id, e);
        }
    }

    public void deleteDoctor(Long id) {
        // Logic to delete a doctor by ID from the database
        try {
            // Simulating database deletion
            System.out.println("Deleting doctor with ID: " + id);
            doctorRepository.deleteById(id);
        } catch (Exception e) {
            // Handle exceptions appropriately
            logger.error("Error deleting doctor with ID {}: {}", id, e.getMessage());
            throw new RuntimeException("Error deleting doctor with ID: " + id, e);
        }
    }

    public Doctor updateDoctor(Long id, Doctor doctor) {
        // Logic to update a doctor by ID in the database
        try {
            // Simulating database update
            System.out.println("Updating doctor with ID: " + id);
            return doctorRepository.save(doctor);
        } catch (Exception e) {
            // Handle exceptions appropriately
            logger.error("Error updating doctor with ID {}: {}", id, e.getMessage());
            throw new RuntimeException("Error updating doctor with ID: " + id, e);
        }
    }
}
