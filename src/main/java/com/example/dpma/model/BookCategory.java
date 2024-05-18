package com.example.dpma.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book_category")
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookcategory_id")
    private int bookcategory_id;

    @Column(name="categoryname")
    private String categoryname;

    @OneToMany
    private List<Book> books;

    public int getBookcategory_id() {
        return bookcategory_id;
    }

    public void setBookcategory_id(int bookcategory_id) {
        this.bookcategory_id = bookcategory_id;
    }


    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
