package edu.icet.repository;

import edu.icet.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> stringList() {
        List<String> stringList = jdbcTemplate.query("SELECT * FROM customer", ((rs, rowNum) -> rs.getString(1)));
        System.out.println(stringList);

        return stringList;
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


