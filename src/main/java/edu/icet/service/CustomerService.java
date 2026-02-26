package edu.icet.service;

import edu.icet.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomer();

    List<String> stringList();

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer);
}
