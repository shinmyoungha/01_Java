package com.hw3.model.dto;

public class Book {
	private String title; // 책제목
	private String writer; // 저자
	private int price; // 가격
	private String publisher; // 출판사
	private int bookNum; // 책 번호
	
	public Book() {}

	// 필드 선언
	public Book(int bookNum, String title, String writer, int price, String publisher) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
		this.bookNum = bookNum;
	}

	// getter/setter 선언

	// 도서 제목
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// 저자
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	// 가격
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 출판사
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// 도서 번호
	public int getBookNum() {
		return bookNum;
	}
	
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	// toString 오버라이드  
	@Override
	public String toString() {
		return  bookNum + "번 도서 : [도서제목 : " + title + 
				" / 도서저자 : " + writer 
				+ " / 도서가격 : " + price + "원 / 출판사 : " + publisher + "]" ;
	}

	
}