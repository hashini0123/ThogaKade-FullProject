package edu.icet.service.Impl;
import edu.icet.model.Customer;
import edu.icet.repository.CustomerRepositoryImpl;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepositoryImpl customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }

    @Override
    public List<String> stringList(){
        return customerRepository.stringList();
    }

    @Override
    public void addCustomer(Customer customer) {
    }

    @Override
    public void updateCustomer(Customer customer) {
        return customerRepository.updateCustomer();
    }
}