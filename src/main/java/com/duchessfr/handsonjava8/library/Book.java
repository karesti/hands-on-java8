package com.duchessfr.handsonjava8.library;


public class Book {
	
	private String name;
	
	private String author;
	
	private long isbn;
	
	private String saga;
	
	private int year;
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSaga() {
		return saga;
	}
	public void setSaga(String saga) {
		this.saga = saga;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
