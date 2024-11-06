package com.webapp.bookstore.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.bookstore.dto.BookDto;
import com.webapp.bookstore.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	private BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	//Add Book
	@PostMapping
	public ResponseEntity<BookDto> addBook(@RequestBody BookDto bookDto) {
		return new ResponseEntity<>(bookService.createBook(bookDto), HttpStatus.CREATED);
	}
	
	//Get Book by ID
	@GetMapping("/{id}")
	public ResponseEntity<BookDto> getBookById(@PathVariable Long id) {
		return new ResponseEntity<>(bookService.getBookById(id), HttpStatus.OK);
	}
	
	//Get All Books
	@GetMapping("/all")
	public ResponseEntity<List<BookDto>> getAllBooks() {
		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
	}

}
