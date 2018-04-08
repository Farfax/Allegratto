package com.kuligowski.maciej.platformy.lab4.allegretto.dao;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

  //  @ManyToMany(cascade = CascadeType.ALL)
    public String title;
    public Long price;
    public String author;
    public Long count;

    public void setDetails(Book details)
    {
        title=details.title;
        price=details.price;
        author=details.author;
        count=details.count;
    }
}
