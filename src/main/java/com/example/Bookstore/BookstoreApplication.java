

package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.web.Book;
import com.example.Bookstore.web.BookRepository;



@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	} 
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
	return (args) -> {
		repository.save(new Book("optimal cs strat","miika",2021,"ak47",50));
		repository.save(new Book("smoke strat","miika",2021,"awp",50));
		repository.save(new Book("ggggg","miika",2021,"ak47",50));
		repository.save(new Book("ggggggggggg","miika",2021,"ak47",50));
	};
	}
	
	}

