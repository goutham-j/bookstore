package com.webapp.bookstore.controller;

import java.util.List;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.bookstore.entity.Book;
import com.webapp.bookstore.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	//Display Home Page
	@GetMapping("/")
	public String viewHomePage() {
		return "home";
	}
	
	//Get Book by ID
	@GetMapping("/get_book/{id}")
	public String getBookById(@PathVariable("id") Long id) {
		bookService.getBookById(id);
		return "redirect:/manage_books";
	}
	
	//Edit Book by ID
	@GetMapping("/edit_book/{id}")
	public String editBookById(Model model, @PathVariable("id") Long id) {
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		return "edit_book";
	}
	
	//Edit Book Redirect to Add Book
	@GetMapping("/edit_book/add_book")
	public String editAddBookPage() {
		return "add_book";
	}
	
	//Edit Book Redirect to Manage Books
	@GetMapping("/edit_book/manage_books")
	public String editManageBooksPage() {
		return "manage_books";
	}
	
	//Delete Book by ID
	@GetMapping("/del_book/{id}")
	public String deleteBookById(@PathVariable("id") Long id) {
		bookService.deleteBookById(id);
		return "redirect:/manage_books";
	}

	//Display Add book page
	@GetMapping("/add_book")
	public String viewAddBookPage() {
		return "add_book";
	}
	
	//Display Manage Books page
	@GetMapping("/manage_books")
	public String viewManageBooksPage(Model model) {
		List<Book> books = bookService.getAllBooks();
		model.addAttribute("book", books);
		return "manage_books";
	}
	
	//Save a new book
	@PostMapping("/save")
	public String saveBook(Model model, @ModelAttribute Book book) {  	
	    if(!book.isEmpty()){
	    	bookService.saveBook(book);
	    }
		return "redirect:/manage_books";
	}
	
	//List books matching keyword
	@GetMapping("/search_books")
	public String viewSearchBooksPage(Model model, @Param("keyword") String keyword) {
		List<Book> books = bookService.searchAllBooks(keyword);
		model.addAttribute("book", books);
		return "search_books";
	}
	
}