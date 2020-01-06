package pl.patryk;

import java.util.Iterator;

public class Librarian {
	
	private String name;
	private String lastName;
	Catalog catalog;
	private Books books;
	
	
	
	public Librarian(String name, String lastName, Catalog catalog) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.catalog = catalog;
	}
	
	
	public String sprawdzStanKatalogu() {
		
		
		return catalog.sprawdzStanKatalogu();
	
	}
	
	
	
}
