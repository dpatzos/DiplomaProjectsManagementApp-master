package com.example.dpma.formdata;

import com.example.dpma.model.User;

import java.util.List;

public class UserProfileFormData {



    private String user_name;

    private User user;

    private String fullname;

    private String address;

    private int age;

    private String phoneNumber;

    private String favBookCategories;

    private String favBookAuthors;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFavBookCategories() {
        return favBookCategories;
    }

    public void setFavBookCategories(String favBookCategories) {
        this.favBookCategories = favBookCategories;
    }

    public String getFavBookAuthors() {
        return favBookAuthors;
    }

    public void setFavBookAuthors(String favBookAuthors) {
        this.favBookAuthors = favBookAuthors;
    }
}
