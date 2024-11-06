package com.webapp.bookstore.dto;

import lombok.Data;

@Data
public class BookDto {
	
    private Long id;
    private String name;
    private String author;
    private double price;
    private int quantity;
    
	public BookDto(Long id, String name, String author, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
