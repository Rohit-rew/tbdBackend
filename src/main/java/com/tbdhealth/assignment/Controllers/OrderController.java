package com.tbdhealth.assignment.Controllers;

import com.tbdhealth.assignment.Entities.Customer;
import com.tbdhealth.assignment.Entities.Order;
import com.tbdhealth.assignment.Entities.Product;
import com.tbdhealth.assignment.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController()
@RequestMapping(path = "order")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @GetMapping()
    public Order getOrders(){
        return this.orderService.sendOrders();
    }

}
