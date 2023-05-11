package com.tbdhealth.assignment.Services;

import com.tbdhealth.assignment.Entities.*;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {

    public Order sendOrders(){
        Customer customer1 = new Customer("Rohit kumar" , "H no 87" , "9728706500");
        Product product1 = new Product("Trimer" , 120.10 , 12);
        Order order1 = new Order(product1 , customer1 , new Date());
        return order1;
    }
}
