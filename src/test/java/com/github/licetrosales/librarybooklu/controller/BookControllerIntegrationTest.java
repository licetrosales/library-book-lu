package com.github.licetrosales.librarybooklu.controller;

import com.github.licetrosales.librarybooklu.model.Book;
import com.github.licetrosales.librarybooklu.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class BookControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    BookRepository bookRepository;
    @Test
    void test_getAllBooks_thenReturnListOfBooks() throws Exception {

        // GIVEN
        Book book1 = new Book("123", "Me", "Java");
        bookRepository.addBook(book1);

        // WHEN
        mockMvc.perform(get("/books"))

                // THEN
                .andExpect(status().isOk())
                .andExpect(content().json("""
                                        [
                                        {
                                        "isbn" : "123",
                                        "author" : "Me",
                                        "title" : "Java"
                                        }]
                        """));




    }

}