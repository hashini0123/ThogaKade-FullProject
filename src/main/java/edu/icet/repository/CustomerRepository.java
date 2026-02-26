package edu.icet.repository;

import edu.icet.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAllCustomer();

    List<String> stringList();

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer);
}
