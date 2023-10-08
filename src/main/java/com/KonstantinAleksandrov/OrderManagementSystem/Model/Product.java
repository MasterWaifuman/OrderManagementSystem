package com.KonstantinAleksandrov.OrderManagementSystem.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String skuCode;
    private Float unitPrice;

    protected Product() {}

    public Product(String name, String skuCode, Float unitPrice) {
        this.name = name;
        this.skuCode = skuCode;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }
}
