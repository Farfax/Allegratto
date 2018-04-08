package com.kuligowski.maciej.platformy.lab4.allegretto.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

  //  @ManyToMany(mappedBy = "title")
 //   private List<Book> books;
}
