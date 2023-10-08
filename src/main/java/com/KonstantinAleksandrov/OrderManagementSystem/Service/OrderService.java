package com.KonstantinAleksandrov.OrderManagementSystem.Service;

import com.KonstantinAleksandrov.OrderManagementSystem.Model.Order;
import com.KonstantinAleksandrov.OrderManagementSystem.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping(value = "/order")
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping
    public List<Order> getOrders(@RequestParam(required = false) String date, @RequestParam(required = false) String customer) throws ParseException {
        if (date != null) {
            Date sortingDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            return orderRepository.findByDateOfSubmission(sortingDate);
        }
        return orderRepository.findAll();
    }

    public void createOrder(Order order) {
        orderRepository.save(order);
    }

    public void deleteOrder(@PathVariable Long id) {
        orderRepository.deleteById(id);
    }
}
