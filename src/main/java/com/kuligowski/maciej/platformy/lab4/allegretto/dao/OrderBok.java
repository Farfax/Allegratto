package com.kuligowski.maciej.platformy.lab4.allegretto.dao;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderBok {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Book> books= new ArrayList();

    public OrderBok()
    {}

    public OrderBok(List<Book> books)
    {
        this.books=books;
    }

    public OrderBok(Book book)
    {
        books.add(book);
    }

}
