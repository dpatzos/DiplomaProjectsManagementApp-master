package com.example.dpma.dao;

import com.example.dpma.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookCategoryDAO extends JpaRepository<BookCategory, Integer> {

   List<BookCategory> findByCategoryname(String categoryname);


}
