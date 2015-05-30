package com.duchessfr.handsonjava8.library;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
public class LibraryTest {
	
	private Library underTest = new Library();
	
	@Test
	public void should_sort_books_by_name() {
		List<Book> result = underTest.sortBooksByName();
		assertThat(result).isSortedAccordingTo(new BookComparatorByNameStrategy());
	}
	
	@Test
	public void should_sort_books_by_author() {
		List<Book> result = underTest.sortBooksByAuthor();
		assertThat(result).isSortedAccordingTo(new BookComparatorByAuthorStrategy());
	}
	
	@Test
	public void should_sort_books_by_year() {
		List<Book> result = underTest.sortBooksByYear();
		assertThat(result).isSortedAccordingTo(new BookComparatorByYearStrategy());
	}

}
