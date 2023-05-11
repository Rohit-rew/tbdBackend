package com.tbdhealth.assignment.Entities;

public class Product {

    String title;
    Double price;
    int quantity;

    public Product(String title , Double price , int quantity){
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
