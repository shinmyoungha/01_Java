package com.hw2.model.dto;

public class Tiger extends Animal {

	/*
	    + Tiger()
	    + Tiger(String name)
		+ sound() : void
	 * 
	 * */
	
	public Tiger() {}
	
	
	public Tiger(String name) {
		super(name);
	}


	public void sound() {
		System.out.println(name + "어흥하며 포효합니다.");
	}
}
