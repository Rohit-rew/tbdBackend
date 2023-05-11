package com.tbdhealth.assignment.Entities;
import java.util.Date;

public class Order {
    Product product;
    Customer customer;
    Date date;

    public Order(Product product , Customer customer , Date date){
        this.product = product;
        this.customer = customer;
        this.date = date;
    }

    public Product getProduct(){
        return this.product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }
}
