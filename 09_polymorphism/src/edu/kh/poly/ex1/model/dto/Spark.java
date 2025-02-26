package edu.kh.poly.ex1.model.dto;

public class Spark extends Car { // 경차

	private double discountOfter; // 할인 혜택

	public Spark() {
	}

	public Spark(String engine, String fuel, int wheel, double discountOfter) {
		super(engine, fuel, wheel);
		this.discountOfter = discountOfter;
	}

	public double getDiscountOfter() {
		return discountOfter;
	}

	public void setDiscountOfter(double discountOfter) {
		this.discountOfter = discountOfter;
	}
	
	// Car.toString()  오버라이딩	
	@Override
	public String toString() {
		return super.toString() + " / " + discountOfter;
	}

}
