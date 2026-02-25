package edu.icet.repository;

import edu.icet.model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    List<Customer> customerList = List.of(
            new Customer("C001", "Ms", "Hashini", LocalDate.of(2026, 01, 25), 25000.0, "walana", "panadura", "western", "12345"),
            new Customer("C002", "Mr", "Kamal", LocalDate.of(2026, 01, 20), 25000.0, "walana", "panadura", "western", "12365")
    );

    public List<Customer> getCustomerList() {
        return customerList;
    }

}

