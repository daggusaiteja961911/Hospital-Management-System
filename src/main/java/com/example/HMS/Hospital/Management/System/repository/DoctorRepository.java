package com.example.HMS.Hospital.Management.System.repository;

import com.example.HMS.Hospital.Management.System.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
