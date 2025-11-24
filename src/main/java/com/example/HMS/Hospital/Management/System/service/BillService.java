package com.example.HMS.Hospital.Management.System.service;

import com.example.HMS.Hospital.Management.System.models.Bill;
import com.example.HMS.Hospital.Management.System.repository.BillRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    @Autowired
    private BillRepository billRepository;

    public List<Bill> getAllBills() {
        try{
            // Logic to retrieve all bills
            System.out.println("Fetching all bills from service");
            return billRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error fetching all bills: " + e.getMessage());
            logger.error("Error fetching all bills : {}", e.getMessage());
            throw e;
        }
    }

    public Bill createBill(Bill bill) {
        try{
            // Logic to create a new bill
            System.out.println("Creating a new bill");
            return billRepository.save(bill);
        } catch (Exception e) {
            System.out.println("Error creating a new bill: " + e.getMessage());
            logger.error("Error creating a new bill : {}", e.getMessage());
            throw e;
        }
    }

    public Bill getBillById(Long id) {
        try {
            // Logic to retrieve a bill by ID
            System.out.println("Fetching bill with ID: " + id);
            return billRepository.findById(id).orElse(null);
        } catch (Exception e) {
            System.out.println("Error fetching bill with ID " + id + ": " + e.getMessage());
            logger.error("Error fetching bill with ID {} : {}", id, e.getMessage());
            throw e;
        }
    }

    public void deleteBill(Long id) {
        try {
            // Logic to delete a bill by ID
            System.out.println("Deleting bill with ID: " + id);
            billRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error deleting bill with ID " + id + ": " + e.getMessage());
            logger.error("Error deleting bill with ID {} : {}", id, e.getMessage());
            throw e;
        }
    }

    public Bill updateBill(Long id, Bill bill) {
        try {
            // Logic to update a bill by ID
            System.out.println("Updating bill with ID: " + id);
            Optional<Bill> existingBillOpt = billRepository.findById(id);
            if (existingBillOpt.isPresent()) {
                Bill existingBill = existingBillOpt.get();
                // Update fields of existingBill with values from bill
                existingBill.setAmount(bill.getAmount());
                existingBill.setStatus(bill.getStatus());
                billRepository.save(existingBill);
                return existingBill;
            } else {
                System.out.println("Bill with ID " + id + " not found.");
                logger.error("Bill with ID {} not found.", id);
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error updating bill with ID " + id + ": " + e.getMessage());
            logger.error("Error updating bill with ID {} : {}", id, e.getMessage());
            throw e;
        }
    }
}
