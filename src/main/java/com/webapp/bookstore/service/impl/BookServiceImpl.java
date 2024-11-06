package com.webapp.bookstore.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.bookstore.dto.BookDto;
import com.webapp.bookstore.entity.Book;
import com.webapp.bookstore.mapper.BookMapper;
import com.webapp.bookstore.repository.BookRepository;
import com.webapp.bookstore.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
 
	@Override
	public BookDto createBook(BookDto bookDto) {
		
		Book book = BookMapper.mapToBook(bookDto);
		Book savedBook = bookRepository.save(book);
		
		return BookMapper.mapToBookDto(savedBook);
	}

	@Override
	public BookDto getBookById(Long Id) {
		
		Book book = bookRepository
				.findById(Id).orElseThrow(()-> new RuntimeException("Book " + Id + " not found!" ));
		
    	return BookMapper.mapToBookDto(book);
	}

	@Override
	public List<BookDto> getAllBooks() {
		
		List<Book> books = bookRepository.findAll();
		
    	return BookMapper.mapToListBookDto(books);
	}
	
}
