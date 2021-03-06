package com.example.Bookstore.web;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Book{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@JsonIgnore
@ManyToOne
private Gategory gategory; 
private String title;
private String author;
private int year;
private String isbn;
private double price;

public Gategory getGategory() {
	return gategory;
}

public void setGategory(Gategory gategory) {
	this.gategory = gategory;
}

public Long getId() {
	return id;
}
public Book() {}

public Book(String title, String author, int year, String isbn, double price, Gategory gategory) {
	super();
	
	this.gategory = gategory;
	this.title = title;
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;
}

public Book(String title, String author, double price) {
	super();
	this.title = title;
	this.author = author;
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
	
	
	

public void setId(Long id) {
	this.id = id;
}




public String getTitle() {
	return title;
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

@Override
public String toString() {
	return "Book [id=" + id + ", gategory=" + gategory + ", title=" + title + ", author=" + author + ", year=" + year
			+ ", isbn=" + isbn + ", price=" + price + "]";
}





}
