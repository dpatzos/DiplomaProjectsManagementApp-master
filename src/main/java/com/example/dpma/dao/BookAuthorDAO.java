package com.example.dpma.dao;

import com.example.dpma.model.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookAuthorDAO extends JpaRepository<BookAuthor, Integer> {


}
