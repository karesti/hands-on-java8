package com.duchessfr.handsonjava8.library;

import java.util.Comparator;

public class BookComparatorByYearStrategy implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		if (book1.getYear() < book2.getYear()) {
			return -1;
		} else if (book1.getYear() > book2.getYear()) {
			return 1;
		} else {
			return 0;
		}   
	}
}
