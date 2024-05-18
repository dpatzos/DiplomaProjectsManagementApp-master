package com.example.dpma.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "bookauthor")
public class BookAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookauthor_id")
    private int bookauthor_id;

    @Column(name = "author_name")
    private String author_name;

    @ManyToMany
    private List<Book> books;

    public int getBookauthor_id() {
        return bookauthor_id;
    }

    public void setBookauthor_id(int bookauthor_id) {
        this.bookauthor_id = bookauthor_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
