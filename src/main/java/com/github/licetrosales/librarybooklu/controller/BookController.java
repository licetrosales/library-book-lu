package com.github.licetrosales.librarybooklu.controller;

import com.github.licetrosales.librarybooklu.model.Book;
import com.github.licetrosales.librarybooklu.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {

        this.bookService = bookService;
    }
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

}