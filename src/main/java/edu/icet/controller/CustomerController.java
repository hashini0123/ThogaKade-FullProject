package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    public CustomerService customerService =new CustomerService();

    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
       return   customerService.getAllCustomer();
    }

}