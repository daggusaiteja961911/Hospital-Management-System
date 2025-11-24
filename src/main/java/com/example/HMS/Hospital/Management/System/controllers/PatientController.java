package com.example.HMS.Hospital.Management.System.controllers;

import com.example.HMS.Hospital.Management.System.models.Patient;
import com.example.HMS.Hospital.Management.System.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public Page<Patient> getAllPatients(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "2") int size) {
        // Logic to retrieve all patients
        System.out.println("Fetching all patients");
        return patientService.getAllPatients(page, size);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        // Logic to create a new patient
        System.out.println("Creating a new patient");
        return patientService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        // Logic to retrieve a patient by ID
        System.out.println("Fetching patient with ID: " + id);
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        // Logic to delete a patient by ID
        System.out.println("Deleting patient with ID: " + id);
        patientService.deletePatient(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        // Logic to update a patient by ID
        System.out.println("Updating patient with ID: " + id);
        return patientService.updatePatient(id, patient);
    }
}
