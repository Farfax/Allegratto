package com.kuligowski.maciej.platformy.lab4.allegretto.repositories;

import com.kuligowski.maciej.platformy.lab4.allegretto.dao.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByPrice(Long price);
    List<Book> findByCount(Long count);

}
