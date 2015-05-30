package com.duchessfr.handsonjava8.library;

import java.util.List;
import java.util.stream.Collectors;


public class Library {
	
	private BookFactory bookFactory = new BookFactory();
	
	private List<Book> library = bookFactory.createLibrary();
	
	public List<Book> sortBooksByName() {
		return library.stream().sorted(new BookComparatorByNameStrategy()).collect(Collectors.toList());
	}


	public List<Book> sortBooksByAuthor() {
		return library;
	}


	public List<Book> sortBooksByYear() {
		return library;
	}

}
