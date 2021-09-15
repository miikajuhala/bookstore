package com.example.Bookstore.web;

import org.springframework.data.repository.CrudRepository;

public interface Gategoryrepository extends CrudRepository<Gategory, Long> {


    Gategory findByName(String name);

}