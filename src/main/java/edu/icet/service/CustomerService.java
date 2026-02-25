package edu.icet.service;

import edu.icet.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomer();

    void addCustomer(Customer customer);
}
