package com.github.licetrosales.librarybooklu.service;

import com.github.licetrosales.librarybooklu.model.Book;
import com.github.licetrosales.librarybooklu.repository.BookRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    private BookRepository mockBookRepository = mock(BookRepository.class);
    private BookService bookService = new BookService(mockBookRepository);
    @Test
    void test_get(){
        // GIVEN
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("123", "Me", "java");
        books.add(book1);
        when(mockBookRepository.getAllBooks()).thenReturn(books);

        // WHEN
        List<Book> result = bookService.getAllBooks(book1);

        // THEN
        List<Book> expected = books;
        assertEquals(expected,result);
    }

}