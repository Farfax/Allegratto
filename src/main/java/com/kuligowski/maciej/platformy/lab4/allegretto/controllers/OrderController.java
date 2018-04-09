package com.kuligowski.maciej.platformy.lab4.allegretto.controllers;

import com.kuligowski.maciej.platformy.lab4.allegretto.dao.Book;
import com.kuligowski.maciej.platformy.lab4.allegretto.dao.OrderBok;
import com.kuligowski.maciej.platformy.lab4.allegretto.exceptions.OrderNotValid;
import com.kuligowski.maciej.platformy.lab4.allegretto.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController()
public class OrderController {

    @Autowired
    OrderRepository repository;

    @PostConstruct
    public void initialize()
    {
        for(int i=0;i<10;i++)
            repository.save(new OrderBok());
    }

    @GetMapping("/order/get/{id}")
    public OrderBok getById(@PathVariable Long id)
    {
        return repository.findById(id).get();
    }

    @GetMapping("/order/get")
    public List<OrderBok> getAll()
    {
        return (List<OrderBok>)repository.findAll();
    }

    @PostMapping("/order/addOrder")
    public OrderBok add(@RequestBody OrderBok orderBok) throws OrderNotValid {
        if(orderBok.books.isEmpty())
        {
            throw new OrderNotValid("Order can't be empty");
            // Not valid
        }

        if(orderBok.books.size()>5)
        {
            throw new OrderNotValid("Can't order more then 5 books");
            // Not valid
        }

        for(Book book : orderBok.books)
        {
            if(book.count<=0)
            {
                throw new OrderNotValid("Book not avaible in magazine");
                //Not valid
            }
        }

        return repository.save(orderBok);
    }
}
