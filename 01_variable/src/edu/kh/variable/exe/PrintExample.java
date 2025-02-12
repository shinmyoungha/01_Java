package edu.kh.variable.exe;

public class PrintExample {

	public static void main(String[] args) {
		
		// System.out.println() : 한 줄 출력용 메서드(출력 후 줄바꿈 수행)
		System.out.println("테스트 1");
		System.out.println("테스트 2");
		
		// System.out.print(); : 단순 출력용 메서드(출력 후 줄바꿈 x)
		System.out.print("테스트 3");
		
		System.out.println( ); // 내용 없는 println() : 단순 줄바꿈
	
		System.out.print("테스트 4");
		
		// 줄바꿈 여부 차이점은 있지만 괄호안의 내용이
		// 그대로 출력된다는것은 똑같음!
		
		System.out.println(); // 바로 위에 print() 사용 했으니 줄바꿈 해줌
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);
		// \n : 줄바꿈
		
		// 이스케이프 문자(escape character) : 특수한 의미를 갖도록 하는 용도로 사용
		
		// System.out.printf("패턴", 패턴자리에 각각 들어갈 값/변수 나열);
		
		/*
		 * %d : 정수형, %o : 8진수, %x : 16진수
         * %c : 문자, %s : 문자열
         * %f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
         * %A : 16진수 실수
         * %b : 논리형
		 * */
		
		// 10 + 10 + 5 / 2 = 35
		int num1 = 10;
		int num2 = 5;
		int num3 = 2;
	
		System.out.printf("%d + %d * %d / %d = %d\n", num1, num1, num2, num3,(num1 + num1 * num2 / num3));
		
		// 패턴연습
		int iNum3 = 3;
		
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3);   // 5칸 공간 확보 후 오른쪽 정렬 
		System.out.printf("%-5d\n", iNum3);  // 5칸 공간 확보 후 왼쪽 정렬
		
		// 소수점 자리 제어(반올림 처리)
		System.out.printf("%f\n", 10/4.0); // 2.500000
		System.out.printf("%.2f\n", 10/4.0); // 2.50(소수점 둘째자리까지 표현)

		// 문자, 문자열, boolean
		boolean inTrue = false;
		char ch = '가';
		String srt = "안녕하세요~!"; // 참조형
		
		//false / 가 / 안녕하세요~!
		
		System.out.printf("%b / %c / %s\n", inTrue, ch, srt);
		
		//    \나타내기
		System.out.println("\\"); // --> \\ 두 번 써야지 오류가 안 뜬다
		
		//  \o/
		System.out.println("\\o/");
		
		// \t : tap (한 공간씩 표현 x, 한 번에 공간차지)
		System.out.println("a\tb\tc\td");
		
		// 유니코드 이스케이프
		System.out.println("\u0041");
		// 유니코드(16진수)
		// 65를 16진수로 표현
		// 65 나누기 16 몫4, 나머지 1
		
	}
}
