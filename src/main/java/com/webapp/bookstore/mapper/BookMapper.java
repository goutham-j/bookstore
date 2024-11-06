package com.webapp.bookstore.mapper;

import java.util.ArrayList;
import java.util.List;

import com.webapp.bookstore.dto.BookDto;
import com.webapp.bookstore.entity.Book;

public class BookMapper {
	
	public static Book mapToBook(BookDto bookDto)  {
		Book book = new Book(
				bookDto.getId(),
				bookDto.getName(),
				bookDto.getAuthor(),
				bookDto.getPrice(),
				bookDto.getQuantity()
				);
		
		return book;
	}
	
	public static BookDto mapToBookDto(Book book) {
		BookDto bookDto = new BookDto(
				book.getId(),
				book.getName(),
				book.getAuthor(),
				book.getPrice(),
				book.getQuantity()
				);
		
		return bookDto;
	}
	
	public static List<BookDto> mapToListBookDto(List<Book> books) {

		List<BookDto> bookDtos = new ArrayList<BookDto>();
		
		for (Book book:books) {
			BookDto bookDto = new BookDto(
					book.getId(),
					book.getName(),
					book.getAuthor(),
					book.getPrice(),
					book.getQuantity()
					);
			bookDtos.add(bookDto);
		}
		return bookDtos;
	}
}
