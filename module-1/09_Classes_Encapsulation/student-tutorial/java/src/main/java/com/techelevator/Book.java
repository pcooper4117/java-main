package com.techelevator;

public class Book {

	private String title;
	
	public String getTitle() {
		 return title;
		}
		public void setTitle(String title) {
		 this.title = title;
		}
		
	private String author;
	
	public String getAuthor() {
		 return author;
		}
		public void setAuthor(String author) {
		 this.author = author;
		}

		
	private double price;
	
	public double getPrice() {
		 return price;
		}
		public void setPrice(double price) {
		 this.price = price;
		}
		public Book(String title, String author, double price) {
			 this.title = title;
			 this.author = author;
			 this.price = price;
			}
		public Book() {
		}
		public String bookInfo() {
			 return "Title: " + title + ", Author: " + author +
			 ", Price: $" + price;
			}
}
 
