package com.tbdhealth.assignment.Services;

import com.tbdhealth.assignment.Entities.*;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {

    public Order getAllOrders(){
        Customer customer1 = new Customer("Rohit kumar" , "H no 87" , "9728706500");
        Product product1 = new Product("Trimer" , 120.10 , 12);
        Product product2 = new Product("Mouse" , 140.10 , 02);
        Product[] products = {product1 , product2};
        Order order1 = new Order(products , customer1 , new Date());
        return order1;
    }

    public String placeOrder(Order order){
        System.out.println(order.toString());
        return "order placed";
    }
}
