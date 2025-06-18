package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "CUSTOMERS_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "AGE")
    private int age;
    @Column(name = "REGISTERED")
    private String registered;
    @Column(name = "ORDERS")
    private int orders;
    @Column(name = "SPENT")
    private BigDecimal spent;
    @Column(name = "JOB")
    private String job;
    @Column(name = "HOBBIES")
    private String hobbies;
    @Column(name = "IS_MARRIED")
    private boolean isMarried;

}
