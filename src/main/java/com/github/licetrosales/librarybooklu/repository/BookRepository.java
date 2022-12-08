package com.github.licetrosales.librarybooklu.repository;

import com.github.licetrosales.librarybooklu.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookRepository {

    private List<Book> books;

    public BookRepository(List<Book> books) {
        this.books = books;
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
