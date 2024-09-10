package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	public void save(String bookName) {
	    // Simulate saving the book to a database
	    System.out.println("Saving book: " + bookName);
	}

}