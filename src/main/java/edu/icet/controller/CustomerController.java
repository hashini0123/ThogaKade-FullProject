package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.Impl.CustomerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    public CustomerServiceImpl customerService =new CustomerServiceImpl();

    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
       return   customerService.getAllCustomer();
    }

    @GetMapping("/add")
    public void addCustomer(){
        return customerService.addCustomer();
    }
}