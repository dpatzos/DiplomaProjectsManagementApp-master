package com.example.dpma.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userprofile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userprofile_id")
    private int userprofile_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @Column(name = "user_name")
    private String username;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private int age;

    @Column(name = "phonenumber")
    private String phonenumber;

    @ManyToMany
    private List<BookCategory> favBookCategory;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<BookAuthor> favBookAuthor;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Book> bookOffers;

    public int getUserprofile_id() {
        return userprofile_id;
    }

    public void setUserprofile_id(int userprofile_id) {
        this.userprofile_id = userprofile_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public List<BookCategory> getFavBookCategory() {
        return favBookCategory;
    }

    public void setFavBookCategory(List<BookCategory> favBookCategory) {
        this.favBookCategory = favBookCategory;
    }

    public List<BookAuthor> getFavBookAuthor() {
        return favBookAuthor;
    }

    public void setFavBookAuthor(List<BookAuthor> favBookAuthor) {
        this.favBookAuthor = favBookAuthor;
    }

    public List<Book> getBookOffers() {
        return bookOffers;
    }

    public void setBookOffers(List<Book> bookOffers) {
        this.bookOffers = bookOffers;
    }
}
