package com.kuligowski.maciej.platformy.lab4.allegretto.controllers;

import com.kuligowski.maciej.platformy.lab4.allegretto.dao.Order;
import com.kuligowski.maciej.platformy.lab4.allegretto.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/order")
public class OrderController {

    @Autowired
    OrderRepository repository;

    @GetMapping("/order/get/{id}")
    public Order getById(@PathVariable Long id)
    {
        return repository.findById(id).get();
    }

    @GetMapping("/order/get")
    public List<Order> getAll()
    {
        return (List<Order>)repository.findAll();
    }

    @PostMapping("/order/add")
    public Order add(@RequestBody Order order)
    {
        return repository.save(order);
    }
}
