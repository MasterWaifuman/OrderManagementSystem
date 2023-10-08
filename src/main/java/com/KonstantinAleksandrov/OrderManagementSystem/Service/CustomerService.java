package com.KonstantinAleksandrov.OrderManagementSystem.Service;

import com.KonstantinAleksandrov.OrderManagementSystem.Model.Customer;
import com.KonstantinAleksandrov.OrderManagementSystem.Model.Order;
import com.KonstantinAleksandrov.OrderManagementSystem.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping(value = "/customer")
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getOrders() {
            return customerRepository.findAll();
    }

    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(@PathVariable Long id) {
        customerRepository.deleteById(id);
    }
}
