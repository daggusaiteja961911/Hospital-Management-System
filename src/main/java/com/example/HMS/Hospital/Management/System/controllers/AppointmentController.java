package com.example.HMS.Hospital.Management.System.controllers;

import com.example.HMS.Hospital.Management.System.models.Appointment;
import com.example.HMS.Hospital.Management.System.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointments() {
        // Logic to retrieve all appointments
        System.out.println("Fetching all appointments");
        return appointmentService.getAllAppointments();
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        // Logic to create a new appointment
        System.out.println("Creating a new appointment");
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        // Logic to retrieve an appointment by ID
        System.out.println("Fetching appointment with ID: " + id);
        return appointmentService.getAppointmentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        // Logic to delete an appointment by ID
        System.out.println("Deleting appointment with ID: " + id);
        appointmentService.deleteAppointment(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
        // Logic to update an appointment by ID
        System.out.println("Updating appointment with ID: " + id);
        return appointmentService.updateAppointment(id, appointment);
    }
}
