package advancedJavaPractice.serilization;

import java.io.Serializable;

// serializable yapmak icin gerekli
public class Book implements Serializable{
	

	private String name;
	private String author;
	private Integer publisherDate;
	
	public Book(String name, String author, Integer publisherDate) {
		super();
		this.name = name;
		this.author = author;
		this.publisherDate = publisherDate;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Integer getPublisherDate() {
		return publisherDate;
	}


	public void setPublisherDate(Integer publisherDate) {
		this.publisherDate = publisherDate;
	}


	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publisherDate=" + publisherDate + "]";
	}

	
	
	

}
