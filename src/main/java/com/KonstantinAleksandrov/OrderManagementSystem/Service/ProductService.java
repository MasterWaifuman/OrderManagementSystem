package com.KonstantinAleksandrov.OrderManagementSystem.Service;

import com.KonstantinAleksandrov.OrderManagementSystem.Model.Customer;
import com.KonstantinAleksandrov.OrderManagementSystem.Model.Product;
import com.KonstantinAleksandrov.OrderManagementSystem.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/product")
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public void createCustomer(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}
