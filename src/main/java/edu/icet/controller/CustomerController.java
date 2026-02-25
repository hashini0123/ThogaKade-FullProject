package edu.icet.controller;

import edu.icet.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    public CustomerService customerService =new CustomerService();

    @GetMapping("/name")
    public String getName() {
        return customerService.getName();
    }
    @GetMapping("/age")
    public String getAge(){
        return customerService.getAge();
    }
}