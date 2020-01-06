package pl.patryk;

import java.util.ArrayList;
import java.util.Iterator;

public class Reader {
	
	private String name;
	private String lastname;
	private Catalog catalog;
	private ArrayList books;
	private Book book;
	
	public Reader(String name, String lastname, Catalog catalog) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.catalog = catalog;
		
	}
	
	
	public Reader(String name, String lastname, Catalog catalog, ArrayList books) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.catalog = catalog;
		this.books = books;
	}

	public ArrayList<Books> boorow(Book book){
		
		System.out.println("Reader borrow: " +book);
		
		catalog.getBooks().remove(book);
				
		return catalog.getBooks();
		
		
	}
	
	
	public ArrayList<Books> returnBook(Book book){
		System.out.println("Reader return book: " +book);

		catalog.getBooks().add(book);
		
		return catalog.getBooks();
		//}
		
		//return null;
		
	}
	public String sprawdzStanKatalogu() {
		
		return catalog.sprawdzStanKatalogu();
	
	}
	
	
}
