package com.example.HMS.Hospital.Management.System.controllers;

import com.example.HMS.Hospital.Management.System.models.Doctor;
import com.example.HMS.Hospital.Management.System.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        // Logic to retrieve all doctors
        System.out.println("Fetching all doctors");
        return doctorService.getAllDoctors();
    }

    @PostMapping
    public Doctor createDoctor(Doctor doctor) {
        // Logic to create a new doctor
        System.out.println("Creating a new doctor");
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(Long id) {
        // Logic to retrieve a doctor by ID
        System.out.println("Fetching doctor with ID: " + id);
        return doctorService.getDoctorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(Long id) {
        // Logic to delete a doctor by ID
        System.out.println("Deleting doctor with ID: " + id);
        doctorService.deleteDoctor(id);
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(Long id, Doctor doctor) {
        // Logic to update a doctor by ID
        System.out.println("Updating doctor with ID: " + id);
        return doctorService.updateDoctor(id, doctor);
    }
}

