package com.example.HMS.Hospital.Management.System.controllers;

import com.example.HMS.Hospital.Management.System.models.Bill;
import com.example.HMS.Hospital.Management.System.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public List<Bill> getAllBills() {
        // Logic to retrieve all bills
        System.out.println("Fetching all bills");
        return billService.getAllBills();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        // Logic to create a new bill
        System.out.println("Creating a new bill");
        return billService.createBill(bill);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        // Logic to retrieve a bill by ID
        System.out.println("Fetching bill with ID: " + id);
        return billService.getBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id) {
        // Logic to delete a bill by ID
        System.out.println("Deleting bill with ID: " + id);
        billService.deleteBill(id);
    }

    @PutMapping("/{id}")
    public Bill updateBill(@PathVariable Long id, @RequestBody Bill bill) {
        // Logic to update a bill by ID
        System.out.println("Updating bill with ID: " + id);
        return billService.updateBill(id, bill);
    }
}
