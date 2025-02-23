package com.demo.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int productId;
    @Column
    private String productName;
    @Column
    private int price;

    public String getProdName() {
        return productName;
    }

    public void setProdName(String prodName) {
        this.productName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProdId() {
        return productId;
    }

    public void setProdId(int prodId) {
        this.productId = prodId;
    }
}
