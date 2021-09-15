package com.example.Bookstore.web;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Gategory {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
@OneToMany
private List<Book> books;

public Gategory() {
	super();
}
public Gategory(String name) {
	super();
	this.name = name;
}
public Gategory( String name, List<Book> books) {
	super();
	this.name = name;
	this.books = books;
}
public Long getId() {
	return id;
}
@Override
public String toString() {
	return "Gategory [name=" + name + "]";
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
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}

}
