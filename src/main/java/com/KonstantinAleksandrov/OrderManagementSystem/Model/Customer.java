package com.KonstantinAleksandrov.OrderManagementSystem.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long registrationCode;
    private String fullName;
    private String email;
    private String telephone;

    protected Customer() {}

    public Customer(Long registrationCode, String fullName, String email, String telephone) {
        this.registrationCode = registrationCode;
        this.fullName = fullName;
        this.email = email;
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public Long getRegistrationCode() {
        return registrationCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
}
