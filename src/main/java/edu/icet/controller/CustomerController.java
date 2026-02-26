package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import edu.icet.service.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    CustomerService service;

    @PostMapping("/add")
    public void addCustomer(Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/get/All")
    public List<Customer> getAll(){
       return service.getAllCustomer();
    }

    @PutMapping
    public void updateCustomer(Customer customer){
        service.updateCustomer(customer);
    }
}