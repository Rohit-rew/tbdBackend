package com.tbdhealth.assignment.Controllers;
import com.tbdhealth.assignment.Entities.*;
import com.tbdhealth.assignment.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return this.orderService.getAllOrders();
    }

    @PostMapping()
    public String placeOrder(@RequestBody Order order){
        return this.orderService.placeOrder(order);
    }
}
