package com.example.dpma.dao;

import com.example.dpma.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface BookDAO extends JpaRepository <Book, Integer> {

    List<Book> findByTitle (String title);
    List<Book> findByTitleContaining (String title);

}
