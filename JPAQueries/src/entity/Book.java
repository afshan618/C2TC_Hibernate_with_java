package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="book")
@NamedQueries(@NamedQuery(name="getAllBooks", query = "SELECT book FROM Book book"))
public class Book implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	@Id
	private Integer Id;
	private String title;
	private String author;
	private Double price;
	
	
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}



	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Book [Id=" + Id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	

}