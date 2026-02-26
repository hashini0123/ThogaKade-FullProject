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

    @GetMapping("/get-all")
    public List<Customer> getAllCustomer(){
       return service.getAllCustomer();
    }

    @GetMapping
    public List<String> stringList(){
        return service.stringList();
    }

    @GetMapping
    public List<String> stringList1(){
        return service.stringList();
    }

    @GetMapping
    public List<String> stringList2(){
        return service.stringList();
    }

    @PostMapping("/add")
    public void addCustomer(Customer customer){
        service.addCustomer(customer);
    }
}