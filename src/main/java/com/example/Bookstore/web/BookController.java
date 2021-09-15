package com.example.Bookstore.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class BookController {
@Autowired
private BookRepository repository;
@Autowired
private Gategoryrepository grepository;

 

@RequestMapping("/index")
public String index(Model model) {

	return "index";

	} 
@RequestMapping("/booklist")
public String bookslist(Model model) {
model.addAttribute("books", repository.findAll()); 
	
return "booklist"; 

	} 



@RequestMapping("/addbook")  
public String addbook(Model model) {
model.addAttribute("book", new Book());  
System.out.println("TAAAÖDAFDFADFDA ADFADF!433333333333333333333"+grepository.findAll());
model.addAttribute("gategories",grepository.findAll());
return "addbook";

	}  
@RequestMapping(value = "/save", method = RequestMethod.POST)
public String save(Book book){
 repository.save(book); 
 return "redirect:booklist";
}

@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
public String deleteStudent(@PathVariable("id") Long bookId, Model model) {
 repository.deleteById(bookId);
 return "redirect:../booklist";
} 

@RequestMapping(value = "/edit/{id}")
public String editStudent(@PathVariable("id") Long bookId, Model model){
model.addAttribute("book", repository.findById(bookId));
return "addbook";
}

}
 

