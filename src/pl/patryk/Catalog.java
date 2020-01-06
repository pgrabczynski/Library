package pl.patryk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Catalog {

	public ArrayList<Book> books;

	public Catalog(List<Book> books) {
		super();
		this.setBooks((ArrayList) books);
	}

	public String sprawdzStanKatalogu() {
		String total = "\n";

		//for( int i = 0; i< collection.size(); i++){
		//Book b = collection.get(i); // get the book at position i
		//total = total + b.toString();
		//}
		
		for (Book book : books) {
			total = total+ book.toString();
		}
		return books.size() + " books"+ total;

//		
//		System.out.print("Catalog has: ");
//		Iterator<Book> i = books.iterator();
//		while(i.hasNext()){
//			
//			Book b = (Book) i.next();
//			total = total+ b.toString()+" ";	
//			
//		}
//		return books.size() + " books"+ total;
//	
	}

	public ArrayList getBooks() {
		return books;
	}

	public void setBooks(ArrayList books) {
		this.books = books;
	}

}
