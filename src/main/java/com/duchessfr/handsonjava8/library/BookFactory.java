package com.duchessfr.handsonjava8.library;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {
	
	
	public Book createBook(String author, String saga, String name, int year, int isbn) {
		Book book = new Book();
		if (author == null || name == null || year == 0 || isbn == 0) {
			throw new IllegalStateException();
		}
		book.setAuthor(author);
		book.setName(name);
		book.setYear(year);
		book.setIsbn(isbn);
		if (saga != null) {
			book.setSaga(saga);
		}
		return book;
	}
	
	public List<Book> createLibrary() {
		List<Book> books = new ArrayList<Book>();
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Le Trône de fer", 1998, 1));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Le Donjon rouge", 1999, 2));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "La Bataille des rois", 2000, 3));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "L'Ombre maléfique", 2000, 4));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "L'Invincible Forteresse", 2000, 5));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Les Brigands", 2001, 6));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "L'Épée de feu", 2001, 7));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Les Noces pourpres", 2001, 8));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "La Loi du régicide", 2003, 9));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Le Chaos", 2006, 10));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Les Sables de Dorne", 2006, 11));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Un festin pour les corbeaux", 2007, 12));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Le Bûcher d'un roi", 2012, 13));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Les Dragons de Meereen",2012, 14));
		books.add(createBook("George Raymond Richard Martin", "Le Trône de fer", "Une danse avec les dragons", 2013, 15));
		books.add(createBook("Isaac Azimov", "Fondation", "Fondation", 1951, 16));
		books.add(createBook("Isaac Azimov", "Fondation", "Fondation et Empire", 1952, 17));
		books.add(createBook("Isaac Azimov", "Fondation", "Seconde Fondation", 1953, 18));
		books.add(createBook("Isaac Azimov", "Fondation", "Fondation Foudroyée", 1982, 19));
		books.add(createBook("Isaac Azimov", "Fondation", "Terre et Fondation", 1986, 20));
		books.add(createBook("Isaac Azimov", "Robots", "Les Robots", 1967, 21));
		books.add(createBook("Isaac Azimov", "Robots", "Un défilé de robots", 1967, 22));
		books.add(createBook("Isaac Azimov", "Robots", "Nous les robots", 1982, 23));
		books.add(createBook("Isaac Azimov", "Robots", "Le robots qui revait", 1988, 24));
		books.add(createBook("Isaac Azimov", "Robots", "Les cavernes d'acier", 1956, 25));
		books.add(createBook("Isaac Azimov", "Robots", "Face aux feux du soleil", 1961, 26));
		books.add(createBook("Isaac Azimov", "Robots", "Les Robots de l'aube", 1984, 27));
		books.add(createBook("Isaac Azimov", "Robots", "Les Robots et l'Empire", 1986, 28));
		books.add(createBook("Carlos Ruiz Zafon", null, "L'Ombre du vent", 2004, 29));
		books.add(createBook("Italo Calvino", null, "Le chevalier inexistant", 1959, 30));
		books.add(createBook("Mathieu Gaborit", "Abyme", "Abyme", 2003, 31));
		books.add(createBook("Mathieu Gaborit", "Les Chroniques des Crépusculaires", "Les Chroniques des Crépusculaires", 2003, 32));
		return books;
	}

}
