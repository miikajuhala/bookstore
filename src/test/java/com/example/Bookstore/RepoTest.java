package com.example.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.Bookstore.web.Book;
import com.example.Bookstore.web.BookRepository;
import com.example.Bookstore.web.Gategory;

import org.junit.jupiter.api.Test;



@ExtendWith(SpringExtension.class)
@DataJpaTest
public class RepoTest {

    @Autowired
    private BookRepository repository;

    @Test
    public void findByTitleShouldReturnBook() {
        List<Book> bookkerna = repository.findByTitle("smoke strat");
        
        assertThat(bookkerna).hasSize(1);
        assertThat(bookkerna.get(0).getAuthor()).isEqualTo("aleksib");
    }
    
    @Test
    public void createBook() {
    	Book book1 = new Book("onetaps", "scream",2000, "fgg", 69, new Gategory("ff"));
    	repository.save(book1);
    	assertThat(book1.getId()).isNotNull();
    }    

}