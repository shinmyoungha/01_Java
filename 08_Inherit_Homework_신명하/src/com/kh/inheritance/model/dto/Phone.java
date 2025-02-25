package com.kh.inheritance.model.dto;

public class Phone {
	
	private String brand; // 브랜드
	private String model; // 모델명
	private int year; // 출시년도
	private int price; // 가격
	
	public Phone() {} // 기본생성자

	public Phone(String brand, String model, int year, int price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// 브랜드
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	// 모델명
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	// 출시년도
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	// 가격
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
		System.out.println("Price : " + price + "원");
	}
	
	
	
	
	
	
	
	
}