package com.example.dpma.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int book_id;

    @Column(name = "title")
    private String title;

    @ManyToMany
    private List<BookAuthor> bookAuthors;

    @ManyToOne
    private BookCategory bookCategory;

    @ManyToMany
    private List<UserProfile> reqUsers;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public List<BookAuthor> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(List<BookAuthor> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public List<UserProfile> getReqUsers() {
        return reqUsers;
    }

    public void setReqUsers(List<UserProfile> reqUsers) {
        this.reqUsers = reqUsers;
    }
}
