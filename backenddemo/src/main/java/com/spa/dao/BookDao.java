package com.spa.dao;
import java.util.List;

import com.spa.models.Book;
public interface BookDao {



	 List<Book> getAllBooks();//select * from book_s190224
	 Book getBook(int isbn);// select * from book_s190224 where isbn=?
	 Book addBook(Book book);//while getting book isbn=0, while returning book isbn will have some value
	 void updateBook(Book book);//isbn of the given book should be present in the table
	 void deleteBook(int isbn);
	}

