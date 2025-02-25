package edu.kh.inhertance.model.dto;

/*
 * 
 * Object
 *    ㄴPerson
 *        ㄴStudent
 * 
 * 
 * */


// 상속 방법 : 자식 extends 부모
public class Student extends Person {
	// Student 클래스에 Person 클래스 내용을 확장한다/연장한다.
	// == Student 클래스에 Person클래스의 필드, 메서드를 추가하여 확장한다.
	
	// 속성(필드)
	/*
	private String name;        // 이름
	private int age;            // 나이
	private String nationality; // 지역
	*/
	private int grade; 		    // 학년
	private int classRoom;  // 반
	
	public Student() {}
	
	// 이름 / 나이 / 국적 / 학년 / 반
	public Student(String name, int age, String nationality,
					int grade, int classRoom) {
		
		// 왜 안될까?
		// -> this 참조변수는 본인 자신만을 의미함
		// -> 상속을 받았어도 name, age, nationality는
		// 부모의 고유 필드이기 때문에
		// 자식인 Student에서 this 참조변수를 이용해 직접 접근 불가
		
		// this.name = name;
		// this.age = age;
		// this.nationality = nationality;
		/*
		setName(name);
		setAge(age);
		setNationality(nationality);
		*/
		// 부모의 setter를 이용 할수는 있지만 비효율적
		
		
		// super(); : 부모의 기본생성자
		// super(매개변수...) : 부모의 매개변수생성자
		super(name, age, nationality); // Person의 배개변수생성자 의미
		this.grade = grade;
		this.classRoom = classRoom;
	}


	
	
	// 기능
	/*
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	*/


	// 학년
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	// 반
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return super.toString() 
		+ " / " + grade + " / " +classRoom;
	}
	
	
}
