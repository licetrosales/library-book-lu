package com.github.licetrosales.librarybooklu.service;

import com.github.licetrosales.librarybooklu.model.Book;
import com.github.licetrosales.librarybooklu.repository.BookRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(Book book1) {
        return bookRepository.getAllBooks();
    }

}
