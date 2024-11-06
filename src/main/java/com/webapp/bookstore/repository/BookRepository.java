package com.webapp.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webapp.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
