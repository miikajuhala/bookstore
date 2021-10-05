

package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.web.Book;
import com.example.Bookstore.web.BookRepository;
import com.example.Bookstore.web.Gategory;
import com.example.Bookstore.web.Gategoryrepository;
import com.example.Bookstore.web.User;
import com.example.Bookstore.web.UserRepository;
 


@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	} 
	
	@Bean
    public CommandLineRunner studentDemo(BookRepository repository, Gategoryrepository grepository, UserRepository urepository) {
        return (args) -> {

          


grepository.save(new Gategory("strats"));
grepository.save(new Gategory("skins"));

        
repository.save(new Book("smoke strat","aleksib", 200,"131554ss", 2.0,
grepository.findByName("strats")));

repository.save(new Book("aim strat","s1mple", 600,"131554ss", 2.0,
grepository.findByName("strats")));

repository.save(new Book("ggggggggg","koirakissa", 2015,"1312554ss", 6.0,
grepository.findByName("skins")));

User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
urepository.save(user1);
urepository.save(user2);


System.out.println(grepository.findByName("strats"));
System.out.println("eka"+grepository.findAll());




   
        };

        }

	}

