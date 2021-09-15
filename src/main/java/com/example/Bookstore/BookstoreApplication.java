

package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.web.Book;
import com.example.Bookstore.web.BookRepository;
import com.example.Bookstore.web.Gategory;
import com.example.Bookstore.web.Gategoryrepository;
 


@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	} 
	
	@Bean
    public CommandLineRunner studentDemo(BookRepository repository, Gategoryrepository grepository) {
        return (args) -> {

          


grepository.save(new Gategory("Holy Books"));
grepository.save(new Gategory("History"));

        
repository.save(new Book("Bible","many authors", 200,"131554ss", 2.0,
grepository.findByName("Holy Books")));

repository.save(new Book("Quran","many authors", 600,"131554ss", 2.0,
grepository.findByName("Holy Books")));

repository.save(new Book("The history of christianity","D. MacCulloch", 2015,"1312554ss", 6.0,
grepository.findByName("History")));

System.out.println(grepository.findByName("History"));
   
        };

        }

	}

