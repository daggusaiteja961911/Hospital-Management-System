package com.example.HMS.Hospital.Management.System.repository;

import com.example.HMS.Hospital.Management.System.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

}
