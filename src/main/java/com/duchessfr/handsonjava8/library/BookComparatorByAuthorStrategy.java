package com.duchessfr.handsonjava8.library;

import java.util.Comparator;

public class BookComparatorByAuthorStrategy implements Comparator<Book> {
	
	@Override
	public int compare(Book book1, Book book2) {
		return book1.getAuthor().compareTo(book2.getAuthor());
	}
	
}
