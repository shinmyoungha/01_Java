package edu.kh.op.ex;

import java.util.Scanner;

// 예제 코드 작성용 클래스 (기능용/매서드용)
public class OpExample {
	
	// ex1() method : OpExample 이라는 클래스에 포함된 메서드
	public void ex1() {
		
		// 증감(증가,감소) 연산자 : ++, --
		// 1을 더하거나 감소시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		// 전위 연산
		int temp1 = 5;
		
		System.out.println(++temp1 + 5); // 11
		                               // 6 + 5
		
		// 후위 연산
		int temp2 = 3;
		System.out.println(temp2-- + 2); // 5
         								// 3 + 2
										// temp = 3 -> 2
		System.out.println(temp2); // 2
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		// 3++ + --5
		// 3++ + 4(b)
		// c = 7
		// 3++ -> 4 (a)
		
		// 최종적으로 a, b, c는 각각 얼마라고 출력될까?
		System.out.printf("%d / %d / %d\n", a, b, c);
		                  // 4   4    7
	}
	
	
	public void ex2() {

		
		// 비교 연산자 : > , < , >= , <=, ==, !=
		// 비교 연산자의 결과는 항상 논리값(true/false)
		
		int a = 10;
		int b = 20;
		
		System.out.println( (a == b) == false); // true
		
		int c = 4;
		int d = 5;
		System.out.println( (++c != d) == (--c != d) ); // false
		
		System.out.println(100 > 99);
		System.out.println(100 >= 100);
		System.out.println(99 < 64);
	}
	
	
	public void ex3() {

		// 논리 연산자 : &&(AND), ||(OR)
		
		// && :  둘 다 true 면 true 나머지 false
		// 와, 그리고, ~면서, ~부터, ~까지, ~사이
		
		int a= 101;
		// a는 100 이상 이면서 짝수인가?
		System.out.println( (a >= 100) && (a % 2 == 0));
		
		int b = 5;
		// b 는 1부터 10까지 숫자 범위에 포함되어 있는가?
		System.out.println( (1 <= b ) && (b <= 10));
		
		// || (OR) : 둘 다 flase 면 false, 나머지 true
		// 또는, 혹은, ~거나
		
		int c = 10;
		
		// c는 10을 초과하거나 짝수인가?
		
		System.out.println((c > 10) || (c % 2 == 0) );
	}
	
	
	public void ex4() {
		// 삼항 연산자 : 조건식 ? true일때 수행될 값 : false일때 수행될 값
		
		int num = 30;
		// num 이 30보다 크면(초과) "num은 30보다 큰 수이다"
		// "아니면 "num은 30 이하의 수이다" 출력
		
		String result = num > 30 ? "num은 30보다 큰 수이다" : "num은 30 이하의 수이다";
		
		System.out.println(result);
		
		//---------------------------------
		
		// 입력받은 정수가 음수인지 양수인지 구분
		// 단, 0은 양수로 처리
		
		// Scanner 생성
		// 정수 입력 : 4
		// 양수입니다.
		// 정수 입력 : -5
		// 음수입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int input = sc.nextInt();
		
		String result1 = input >= 0 ? "양수입니다." : "음수입니다.";
		
		System.out.println(result1);
		
	}
}