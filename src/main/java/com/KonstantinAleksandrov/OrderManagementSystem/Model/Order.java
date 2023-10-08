package com.KonstantinAleksandrov.OrderManagementSystem.Model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany
    private List<OrderLine> orderLines;
    @OneToOne
    private Customer customer;
    private Date dateOfSubmission;

    protected Order() {}

    public Order(List<OrderLine> orderLines, Customer customer, Date dateOfSubmission) {
        this.orderLines = orderLines;
        this.customer = customer;
        this.dateOfSubmission = dateOfSubmission;
    }

    public Long getId() {
        return id;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDateOfSubmission() {
        return dateOfSubmission;
    }
}
