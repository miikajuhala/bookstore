package com.example.Bookstore.web;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Book{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}
private String title;
private String author;
private int year;
private String isbn;
private double price;

public Book() {}

public String getTitle() {
	return title;
}
public Book(String title, String author, double price) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
}

public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Book(String title, String author, int year, String isbn, double price) {
	super();
	this.title = title;
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;

}
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price
			+ "]";
}



}
