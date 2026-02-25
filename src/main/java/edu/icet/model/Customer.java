package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    private String custID;

    private String custTitle;

    private String custName;

    private LocalDate DOB;

    private double salary;

    private String custAddress;

    private String city;

    private String province;

    private String postalCode;

}
