package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		// Friend 객체만 넣을수 있는 ArrayList 객체 생성 후
		List<Friend> List = new ArrayList<>();

		// 짱구, 철수, 유리, 훈이, 맹구 객체 생성하여 ArrayList에 추가하기
		List.add(new Friend("짱구")); 
		List.add(new Friend("철수")); 
		List.add(new Friend("유리")); 
		List.add(new Friend("훈이")); 
		List.add(new Friend("맹구")); 
		
		
		
		// List에서 다섯 객체 중 랜덤으로 하나를 뽑아
		int randomIndex = (int) (Math.random() * List.size());
		Friend leader = List.get(randomIndex);
		leader.pickLeader();
	
		
		
		
	
	}
}
