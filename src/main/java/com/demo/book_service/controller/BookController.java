package com.demo.book_service.controller;

import com.demo.book_service.entity.BookEntity;
import com.demo.book_service.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public List<BookEntity> getAllBooks(){
        List<BookEntity> allBooks = bookRepository.findAll();
        return  allBooks;
    }

    @PostMapping("/books")
    public BookEntity addBook(@RequestBody BookEntity book){
        BookEntity b = bookRepository.save(book);
        return b;
    }

    @GetMapping("/books/{bid}")
    public BookEntity getBookId(@PathVariable int bid){
        BookEntity book = bookRepository.findById(bid).orElse(null);
        return book;
    }


}
