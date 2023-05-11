package com.tbdhealth.assignment.Entities;
import java.util.Arrays;
import java.util.Date;

public class Order {
    Product[] products;
    Customer customer;
    Date date;
    String orderId;

    public Order(Product[] product , Customer customer , Date date){
        this.products = product;
        this.customer = customer;
        this.date = date;
    }

    public Product[] getProduct(){
        return this.products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public String getOrderId() {
        return orderId;
    }

    @Override
    public String toString(){
        return "{product : %s , customer : %s , date : %s , orderId : %s}".formatted(Arrays.deepToString(products), this.customer.toString() , this.date.toString() , this.orderId);
    }
}
