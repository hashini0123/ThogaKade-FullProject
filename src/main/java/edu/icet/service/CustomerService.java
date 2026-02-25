package edu.icet.service;
import edu.icet.model.Customer;
import edu.icet.repository.CustomerRepository;

import java.util.List;

public class CustomerService {

    private CustomerRepository customerRepository = new CustomerRepository();

    public List<Customer> getAllCustomer(){
        return customerRepository.getCustomerList();
    }

}