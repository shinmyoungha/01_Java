package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {
		
		//형변환 (Casting) : 값의 자료형을 변환하는 것 (단, boolean 제외)
		/*
		 * **형변환은 왜 필요한가?
		 * - 컴퓨터는 기본적으로 같은 자료형끼리만 연산이 가능함
		 * 다른 자료형과 연산 시 오류 발생.
		 *  --> 이런 상황을 해결하기 위해서 필요한 기술이 형변환.
		 *  
		 *  자동 / 강제 형변환 존재 
		 * 
		 * 
		 * */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1 + num2)); // 13.5
		// 원래 에러가 발생해야 하지만 "자동 형변환" 덕분에 발생하지 않는다

		//int -> long 형변환
		int i2 = 2_100_000_000;  //21억 2,100,000,000 --> 2_100_000_000 이렇게 포현 가능
		long l2 = 10_000_000_000L; //100억  10,000,000,000 --> 10_000_000_000 
		
		long result = i2 + l2;
		//            long + long
		// long = long + long (가능!)
		
		System.out.println(result); // 12100000000

		
		// char --> int 형변환
		// char 자료형은 문자형이지만 실제 저장하는 값은
		// 0부터 65000번 사이의 있는 숫자(정수형)
		
		char ch3 = 'V'; // A = 65, V = 86
		int i3 = ch3;
		System.out.println(i3);
		
		char ch4='각'; // '각; 이라는 글자는 숫자 몇일까?
		int i4 = ch4;
		System.out.println(i4); // 44033
		
		
	}

}
