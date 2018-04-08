package com.kuligowski.maciej.platformy.lab4.allegretto.controllers;

import com.kuligowski.maciej.platformy.lab4.allegretto.dao.Book;
import com.kuligowski.maciej.platformy.lab4.allegretto.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/books")
public class BooksController {

    @Autowired
    BooksRepository repository;

    @GetMapping("/get/{id}")
    public Book getById(@PathVariable Long id)
    {
        return repository.findById(id).get();
    }

    @GetMapping("/get")
    public List<Book> getAll()
    {
        return (List<Book>)repository.findAll();
    }

    @PutMapping("/update/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book details)
    {
       Book book = repository.findById(id).get();
       book.setDetails(details);
       return repository.save(details);
    }

    @PostMapping("/add")
    public Book add(@RequestBody Book book)
    {
        return repository.save(book);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id)
    {
        repository.delete(repository.findById(id).get());
    }


}
