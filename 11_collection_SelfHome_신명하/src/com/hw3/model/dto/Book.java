package com.hw3.model.dto;

public class Book {
	
	private String title; // 도서명
	private String author; // 저자
	private int price; // 가격
	private String publisher; // 출판사
	private int booknum; // 도서 번호
	
	public Book() {}

	public Book(String title, String author, int price, String publisher, int booknum) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.booknum = booknum;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBooknum() {
		return booknum;
	}

	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}

	@Override
	public String toString() {
		return  booknum + "번 도서 : [도서제목 : " + title + "/ 도서 저자 : " + author + 
				"/ 도서 가격 : " + price + "원 / 출판사 : " + publisher + "]" ;
	}
	
	
}
