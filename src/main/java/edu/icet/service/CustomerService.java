package edu.icet.service;
import edu.icet.repository.CustomerRepository;

public class CustomerService {

    private CustomerRepository customerRepository;

    public String getName(){
        return customerRepository.getName();
    }

    public String getAge(){
        return customerRepository.getAge();
    }
}