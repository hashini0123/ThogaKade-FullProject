package edu.icet.repository;

import edu.icet.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAllCustomer() {
        String sql =" SELECT * FROM customer";
        List<Customer> customerList=jdbcTemplate.query(sql,(rs, rowNum) -> {
            Customer customer=new Customer();
            customer.setId(rs.getString(1));
            customer.setTitle(rs.getString(2));
            customer.setName(rs.getString(3));
            customer.setDOB(rs.getDate(4));
            customer.setSalary(rs.getDouble(5));
            customer.setAddress(rs.getString(6));
            customer.setCity(rs.getString(7));
            customer.setProvince(rs.getString(8));
            customer.setPostalCode(rs.getString(9));
            return customer;
        });
        return customerList;
    }

    public List<String> stringList() {
        List<String> stringList = jdbcTemplate.query("SELECT * FROM customer", ((rs, rowNum) -> rs.getString(1)));
        System.out.println(stringList);

        return stringList;
    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Customer customer) {
        String sql = "UPDATE customer SET";

    }

    public List<String> stringList1(){
        List<String> stringList1 = jdbcTemplate.query("SELECT * FROM customer",((rs, rowNum) -> rs.getString(2)));
        System.out.println(stringList1);

        return stringList1;
    }

    public List<String> stringList2(){
        List<String> stringList2 = jdbcTemplate.query("SELECT * FROM customer",((rs, rowNum) -> rs.getString(3)));
        System.out.println(stringList2);

        return stringList2;
    }

    public List<String> stringList3(){
        List<String> stringList3 = jdbcTemplate.query("SELECT * FROM customer",((rs, rowNum) -> rs.getString(4)));
        System.out.println(stringList3);

        return stringList3;
    }
}


