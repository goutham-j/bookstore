package com.webapp.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.bookstore.entity.Book;
import com.webapp.bookstore.repository.BookRepository;

@Service
@Transactional
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
 
	public void saveBook(Book book) {
		bookRepository.save(book);
	}

	public List<Book> getAllBooks() {
		List<Book> books = bookRepository.findAll();
    	return books;
	}
	
	public Book getBookById(Long Id) {
		Book book = bookRepository.findById(Id).get();
    	return book;
	}
	
	public void deleteBookById(Long Id) {
		bookRepository.deleteById(Id);
	}
	
	public void editBookById(Long Id) {
		bookRepository.save(getBookById(Id));
	}
	
	public List<Book> searchAllBooks(String keyword) {
		if (!keyword.isEmpty())
			return (List<Book>) bookRepository.findByKeyword(keyword);
		else
			return (List<Book>) bookRepository.findAll();
	}
}