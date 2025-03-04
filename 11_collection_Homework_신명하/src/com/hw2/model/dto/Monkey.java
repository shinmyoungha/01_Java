package com.hw2.model.dto;

public class Monkey extends Animal {

	/*
	 	+ Monkey()
		+ Monkey(String name)
		+ sound() : void
	 * */
	
	public Monkey() {}

	public Monkey(String name) {
		super(name);
	}
	
	public void sound() {
		System.out.println(name + "가 우끼끼 소리를 냅니다.");
	}
}
