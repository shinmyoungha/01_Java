package edu.kh.basic;


// git 테스트! 집에서 코드 변경해봄
// 학원에서 공부함..

// 초록색 글씨

// 한 줄 주석 : (컴파일러가 해석하지 않는 부분)
/*
 * \
 * 범위 주석
 */

//class : 자바 코드가 작성되는 영역

public class JavaTest {

	//main 작성하고 ctrl + space -> 자동완성 가능
	//main 메서드 : 자바 애플리케이션(프로그램)
	//              반드시 필요한 구문
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("저녁 뭐 먹을까?");
		System.out.println("12345");
		//syso 작성 후 ctrl + space --> System.out.println(); 자동완성
		System.out.println();
		//ctrl + alt + 방향키(위아래) : 방향키 방향으로 해당 줄 복사 
		System.out.println("Hi");
		System.out.println("Hi"); //println이란 메서드는 콘솔창에 출력해주는 기능
		System.out.println("Hi");
		
		//숫자연산
		System.out.println("1 + 2"); // 1 + 2
		System.out.println(1 + 2); // 3
		
		// ""안에 작성된 코드는 단순 문자열로 인식
		// ""안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		System.out.println(50 - 23);
		System.out.println(12 * 13);
		System.out.println(327 / 3);
		System.out.println(12 % 2); // 0, %는 나머지를 나타냄
		
		// "" (문자열) + 숫자 함께 작성
		System.out.println("14 * 19 = " + 266);
		System.out.println("14 * 19 = " + 14 * 19);
	
		System.out.println("90 + 70 + 65 = " + 90 + 70 + 65); // 문자열 이어쓰기로 인식 --> 907065
		System.out.println("90 + 70 + 65 = " + (90 + 70 + 65)); // ---> 225
		//Java는 사칙연산의 우선 순위를 그대로 따른다.
		// --> 우선 계산을 원하면 () 괄호 사용
		
		// + 라는 기호의 역할
		// --> 숫자 + 숫자 = 덧셈 연산 결과
		// --> 문자열 + 숫자 or 문자열 + 문자열 --> 이어쓰기
		System.out.println("A" + "B");
		
	}
}