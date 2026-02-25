package edu.icet.service.Impl;
import edu.icet.model.Customer;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.getCustomerList();
    }

    @Override
    public void addCustomer(Customer customer) {

    }
}