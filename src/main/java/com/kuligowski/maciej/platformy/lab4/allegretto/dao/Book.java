package com.kuligowski.maciej.platformy.lab4.allegretto.dao;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    public String title="no Name";
    public Long price=(long)0;
    public String author="no Author";
    public Long count=(long)0;

    public Book()
    {}

    public Book(String title)
    {
        this.title=title;
    }

    public Book(String title, Long price, String author, Long count)
    {
        this.title=title;
        this.price=price;
        this.author=author;
        this.count=count;
    }

    public void setDetails(Book details)
    {
        title=details.title;
        price=details.price;
        author=details.author;
        count=details.count;
    }
}
