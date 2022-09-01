package dao;

import java.util.List;

import entity.Book;

public interface BookDao {
	
	public abstract Book getBookById(int id);
	
	public abstract List<Book> getBookbyTitle(String title);
	
	public abstract Long getBookCount();
	
	public abstract List<Book> getAuthorBooks(String author);
	
	public abstract List<Book> getAllBooks();
	
	public abstract List<Book> getbooksInPriceRange(double low, double high);
}