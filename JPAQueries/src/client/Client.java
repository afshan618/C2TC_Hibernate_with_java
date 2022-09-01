package client;

import entity.Book;
import service.BookService;
import service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		BookService service = new BookServiceImpl();
		
		System.out.println("*****************Listing total number of books*****************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("\n");
		
		System.out.println("*****************Listing book with id 103*****************");
		System.out.println("Book with Id 103:"+service.getBookById(103));
		
		System.out.println("\n");
		
		System.out.println("*****************Listing All books*****************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		System.out.println("\n");
		
		System.out.println("*****************Listing book written by George Mathew Adams*****************");
		for(Book book:service.getAuthorBooks("George Mathew Adams")) {
			System.out.println(book);
		}
		
		System.out.println("\n");

		System.out.println("*****************Listing book Life Without Limits*****************");
		for(Book book:service.getBookByTitle("Life Without Limits")) {
			System.out.println(book);
		}
		
		System.out.println("\n");
		
		System.out.println("*****************Listing All Books between 350 and 500*****************");
		for(Book book:service.getBooksInPriceRange(350, 500)) {
			System.out.println(book);
		}
	}

}