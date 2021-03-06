package com.spa.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spa.models.Book;
@Repository
@Transactional
public class BookDaoImpl implements BookDao {
	@Autowired
 SessionFactory sessionFactory;
	public List<Book> getAllBooks() {
		Session session=sessionFactory.getCurrentSession();
		//HQL - from Book
		//SQL -  select * from book_s190224
		Query query=session.createQuery("from Book");
		return query.list();
	}
	public Book getBook(int isbn) {
		Session session=sessionFactory.getCurrentSession();
		Book book=(Book)session.get(Book.class, isbn);
		return book;
	}
	public Book addBook(Book book) {
		Session session=sessionFactory.getCurrentSession();
		session.save(book);
		return book;
	}
	public void updateBook(Book book) {
		Session session=sessionFactory.getCurrentSession();
		session.update(book);
	}
	public void deleteBook(int isbn) {
		Session session=sessionFactory.getCurrentSession();
		Book book=(Book)session.get(Book.class, isbn);
		session.delete(book);
		
	}

}


