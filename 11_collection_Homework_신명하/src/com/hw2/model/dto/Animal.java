package com.hw2.model.dto;

public abstract class Animal {

	/* # name: String
	   + Animal()
       + Animal(String name)
       + abstract sound() : void
	 * 
	 * */
	
	protected String name;
	
	public Animal() {}
	public Animal(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sound();  
}
