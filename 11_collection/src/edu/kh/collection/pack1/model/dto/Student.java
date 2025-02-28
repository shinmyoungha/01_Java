package edu.kh.collection.pack1.model.dto;

public class Student implements Comparable<Student>{

	// 속성
	private String name; // 이름
	private int age; // 나이
	private String region; // 지역
	private char gender; // 성별
	private int score; // 점수
	private Object other;

	public Student(String name, int age, String region, char gender, int score) {
		super();
		this.name = name;
		this.age = age;
		this.region = region;
		this.gender = gender;
		this.score = score;
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

	
	// 지역
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	
	// 성별
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	// 점수
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", region=" + region + ", gender=" + gender + ", score="
				+ score + "]";
	}


	@Override
	public int compareTo(Student other) {
		// compareTo() : 두 객체를 비교하고 순서를 결정.
		// 반환값 : 0(같음), 양수(왼족 객체가 큼), 음수(왼쪽 객체가 작음)
		
		// 현재 객체의 나이 - 다른 객체의 나이
		// -> 값이 양수면 현재 객체의 나이가 더 크다
		// -> 값이 음수면 현재 객체의 나이가 더 적다
		return this.age - other.age;
	}
	
	

}
