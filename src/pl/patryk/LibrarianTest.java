package pl.patryk;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class LibrarianTest {
	
	@Test
	void test() {
		Book book = new Book("ABC", "Adam Mickiewicz", "Pan Tadeusz");
		List<Book> books = new ArrayList<Book>();
		books.add(book);
		Catalog catalog = new Catalog(books);
		Librarian librarian = new Librarian("Jan","Kowalski", catalog );
		assertEquals(librarian.sprawdzStanKatalogu(), "1 books\n" + 
				"Book [isbn=ABC, author=Adam Mickiewicz, title=Pan Tadeusz]\n");
		
	}

}
