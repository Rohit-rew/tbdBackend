package com.tbdhealth.assignment.Controllers;

import com.tbdhealth.assignment.Entities.Customer;
import com.tbdhealth.assignment.Entities.Order;
import com.tbdhealth.assignment.Entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController()
@RequestMapping(path = "order")
public class OrderController {

    @GetMapping()
    public Order getOrders(){

        Customer customer1 = new Customer("Rohit kumar" , "H no 87" , "9728706500");
        Product product1 = new Product("Trimer" , 120.10 , 12);
        Order order1 = new Order(product1 , customer1 , new Date());

        return order1;
    }

}
