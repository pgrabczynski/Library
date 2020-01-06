package pl.patryk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Library {
	
	public static void main(String [] args) {
		List<Book> books = new ArrayList<Book>();
		Catalog catalog = new Catalog(books);
		Librarian librarian = new Librarian("Ania", "Kowalska", catalog);
		Reader reader = new Reader("Maciej", "Nowak", catalog);
		
		Book book = new Book("1", "Jan Kowalski", "abecadlo");
		Book book1 = new Book("2", "Jan Brzechwa", "abecadlo");
		Book book2 = new Book("3", "Andrzej Sapko", "zyzzzzz");
		
		books.add(book);
		books.add(book1);
		books.add(book2);
		
		IntStream liczby = IntStream.of(1,2,3,4);
		
		
		
		 List ksiazki =  books.stream().filter(a->a.getIsbn().contains("1")).collect(Collectors.toList());
		 
		 System.out.println(ksiazki.toString());
		 
		
		reader.boorow(book2);
		System.out.println(librarian.sprawdzStanKatalogu());

		reader.returnBook(book2);
		
		System.out.println(librarian.sprawdzStanKatalogu());
		
		reader.boorow(book1);
		
		System.out.println(librarian.sprawdzStanKatalogu());
		
		
		System.out.println();
		
		System.out.println(reader.sprawdzStanKatalogu());
		
		
		}

}
