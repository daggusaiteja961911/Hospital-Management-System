package com.example.HMS.Hospital.Management.System.service;

import com.example.HMS.Hospital.Management.System.models.Appointment;
import com.example.HMS.Hospital.Management.System.repository.AppointmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        try{
            // Logic to retrieve all appointments
            System.out.println("Fetching all appointments from service");
            return appointmentRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error fetching all appointments: " + e.getMessage());
            logger.error("Error fetching all appointments : {}", e.getMessage());
            throw e;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try{
            // Logic to create a new appointment
            System.out.println("Creating a new appointment");
            return appointmentRepository.save(appointment);
        } catch (Exception e) {
            System.out.println("Error creating a new appointment: " + e.getMessage());
            logger.error("Error creating a new appointment : {}", e.getMessage());
            throw e;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            // Logic to retrieve an appointment by ID
            System.out.println("Fetching appointment with ID: " + id);
            return appointmentRepository.findById(id).orElse(null);
        } catch (Exception e) {
            System.out.println("Error fetching appointment with ID " + id + ": " + e.getMessage());
            logger.error("Error fetching appointment with ID {} : {}", id, e.getMessage());
            throw e;
        }
    }

    public void deleteAppointment(Long id) {
        try {
            // Logic to delete an appointment by ID
            System.out.println("Deleting appointment with ID: " + id);
            appointmentRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error deleting appointment with ID " + id + ": " + e.getMessage());
            logger.error("Error deleting appointment with ID {} : {}", id, e.getMessage());
            throw e;
        }
    }

    public Appointment updateAppointment(Long id, Appointment appointment) {
        try {
            // Logic to update an appointment by ID
            System.out.println("Updating appointment with ID: " + id);
            Optional<Appointment> existingAppointmentOpt = appointmentRepository.findById(id);
            if (existingAppointmentOpt.isPresent()) {
                Appointment existingAppointment = existingAppointmentOpt.get();
                // Update fields of existingAppointment with values from appointment
                existingAppointment.setDate(appointment.getDate());
                appointmentRepository.save(existingAppointment);
                return existingAppointment;
            } else {
                System.out.println("Appointment with ID " + id + " not found.");
                logger.error("Appointment with ID {} not found.", id);
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error updating appointment with ID " + id + ": " + e.getMessage());
            logger.error("Error updating appointment with ID {} : {}", id, e.getMessage());
            throw e;
        }
    }
}
