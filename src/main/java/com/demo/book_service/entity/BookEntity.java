package com.demo.book_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
    @Id
    private int BookId;
    private String BookName;

    public BookEntity(int bookId, String bookName) {
        BookId = bookId;
        BookName = bookName;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }
}
