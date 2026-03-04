package com.educandoweb.demo.entities;

import java.io.Serializable;

public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1l;
    private Integer quantity;
    private Double price;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
