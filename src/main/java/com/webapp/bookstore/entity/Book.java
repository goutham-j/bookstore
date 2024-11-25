package com.webapp.bookstore.entity;

import org.apache.logging.log4j.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="books")
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="author")
    private String author;
	
	@Column(name="price")
    private double price;
	
	@Column(name="quantity")
    private int quantity;
    
	public Book() {
		super();
	}
	
	public Book(Long id, String name, String author, double price, int quantity) {
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
	
	public Boolean isEmpty() {
		if (Strings.isBlank(this.name) || Strings.isBlank(this.author) || this.price == 0 || this.quantity == 0)
			return true;
		else
			return false;
	}
}