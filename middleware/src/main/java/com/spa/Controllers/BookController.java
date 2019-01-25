package com.spa.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spa.dao.BookDao;
import com.spa.models.Book;

@Controller
public class BookController {
	@Autowired
public BookDao bookDao;

public BookController(){
	System.out.println("BookController bean is created");
}
	//Convert List<Book> into array of JSON objects
	@RequestMapping(value="/getallbooks",method=RequestMethod.GET)
public @ResponseBody List<Book> getAllBooks(){
	List<Book> books=bookDao.getAllBooks();
	return books;       
}
	
@RequestMapping(value="/getbook",method=RequestMethod.GET)	
public @ResponseBody  Book getBook(@RequestParam int isbn){
	Book book=bookDao.getBook(isbn);
	return book;
}
@RequestMapping(value="/addbook",method=RequestMethod.POST)
public  @ResponseBody   Book  addBook(@RequestBody Book book){
	//input - Book object in JSON, in body of http request
	//output - Book object in JSON, in body of Http Response
	bookDao.addBook(book);
	return book;
	
}
@RequestMapping(value="/updatebook",method=RequestMethod.PUT)
public @ResponseBody Book updateBook(@RequestBody Book book){
	bookDao.updateBook(book);
	return book;
}
}
