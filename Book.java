package com.inh.bll;

public class Book {
	private String isbn;
	private String name;//book name
	private Author author;//book author details
	private double price;
	private int qty=0;

	public Book(String isbn,String name,Author author, double price, int qty) {// Parameterized constructor
		this.isbn=isbn;
		this.name=name;
		this.author=author;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}

	public Author getAuthor() {
			return author;
		}
	
	public double getPrice() {
			return price;
		}
	
	public void setPrice(double price) {
			this.price = price;
		}
	
	public int getQty() {
			return qty;
		}
	
	public void setQty(int qty) {
			this.qty = qty;
		}	
    
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
		public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + author +", price=" + price+", qty=" + qty+"]"; 
				
	}
}
