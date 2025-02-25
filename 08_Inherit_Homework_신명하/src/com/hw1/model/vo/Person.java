package com.hw1.model.vo;

public class Person {

	// 필드
	protected String name; 
	// 상속받은 후손 클래스에서 직접 접근 가능
	
	private int age; // 나이
	private double height; // 키
	private double weight; // 몸무게
	
	/*
	 * private 필드는 상속을 통해 자식클래스가
	 * 부모 클래스의 필드를 물려받더라도
	 * getter/setter 를 이용하여 간접 접근 해야함.
	 * 
	 * protected 필드는 상속받은 자식이 마치 원래 본인것이었던거처럼
	 * 사용가능하기 때문에 부모 필드에 직접 접근 가능
	 * 
	 * 
	 * */
	
	public Person() {}

	public Person(int age, double height, double weught) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	
	// 이름
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// 나이
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	// 키
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	// 몸무게
	public double getWeught() {
		return weight;
	}

	public void setWeught(double weught) {
		this.weight = weught;
	}
	
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f",
				name, age, height, weight);
		// -> "이름 : 홍길동 / 나이 : 20 / 신장 : 180.0 / 몸무게 : 70.0"
	}
}
