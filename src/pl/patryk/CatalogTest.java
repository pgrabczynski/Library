package pl.patryk;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CatalogTest {

	@Test
	void test() {
		List<Book> book = new ArrayList<Book>();
		book.add(new Book("1","2", "3"));
		
		Catalog catalog = new Catalog(book);
		
		String result = catalog.sprawdzStanKatalogu();
		
		System.out.println(result);
		
		System.out.println("1 books\nBook [isbn=1, author=2, title=3]");
		//	  assert("1 books\nBook [isbn=1, author=2, title=3]",result );
		//assertTrue("1 books\nBook [isbn=1, author=2, title=3]\n".equals(result));
		
		assertEquals("1 books\nBook [isbn=1, author=2, title=3]\n", result);
	}

}
