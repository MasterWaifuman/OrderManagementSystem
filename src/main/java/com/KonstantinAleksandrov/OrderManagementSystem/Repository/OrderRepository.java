package com.KonstantinAleksandrov.OrderManagementSystem.Repository;

import com.KonstantinAleksandrov.OrderManagementSystem.Model.Customer;
import com.KonstantinAleksandrov.OrderManagementSystem.Model.Order;
import com.KonstantinAleksandrov.OrderManagementSystem.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByDateOfSubmission(Date date);
}
