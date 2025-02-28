package com.hw1.model.dto;

import java.util.ArrayList;
import java.util.List;

public class Friend {
	/*	- name: String
		+ Friend()
		+ Friend(String name)
		+ pickLeader() : void
	 */
	private String name; // 이름
	
	public Friend() {}
	
	public Friend(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 골목대장이 누군지 출력하기
	public void pickLeader() {
		System.out.printf(name +"가 떡잎방범대 대장이다!");
	}
}
