package com.webapp.bookstore.service;

import java.util.List;

import com.webapp.bookstore.dto.BookDto;

public interface BookService {
	BookDto createBook(BookDto bookDto);
	BookDto getBookById(Long Id);
	List<BookDto> getAllBooks();
}