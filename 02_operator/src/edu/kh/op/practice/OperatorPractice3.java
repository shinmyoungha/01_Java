package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice1() {

		/*마트에서 고객에게 할인 혜택을 제공하려고 한다
		 * 물건의 총 가격과 회원 여부를 입력받아, 
		 * 회원이라면 10% 할인을 적용하고, 
		 * 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격을 입력하세요 : ");
		int totalPrice = sc.nextInt();
		
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		boolean isMember = sc.nextBoolean();
		
		double discount = isMember ? totalPrice * 0.10 : totalPrice * 0.05;
		
		double finalPrice = totalPrice - discount;
		
		System.out.printf("할인율 : " + discount);
		System.out.println();
		System.out.printf("할인을 포함한 최종 금액 : %.1f", finalPrice);
	}
	
	
	
	/*
	 * ATM에서 사용자가 원하는 금액을 입력하면, 
	 * 5만원, 1만원, 5천원, 1천원 단위로 
	 * 최소 개수의 지폐로 돈을 인출하라
	 * ex) 사용자가 123000원을 입력하면, 
	 * 5만원 지폐 2장, 1만원 지폐 2장, 
	 * 5천원 지폐 0장, 1천원 지폐 3장이 필요함 
	 * */
	
	
	
		public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출금할 금액 입력 : ");
		int amount = sc.nextInt();
		
		int fiftyTh = amount / 50000; // 5만원짜리 지폐 갯수
		amount = amount % 50000; // 5만원짜리 지폐 거르고 난 뒤 나머지 금액
		// 나머지 값을 amount변수에 재대입해야 아래 다음 지폐에서 재사용 할 수 있음
		
		amount %= 50000; // 복합대입연산자 (%와 = 을 합쳐 사용)
		//amount = amount % 50000; 같은 말임
		
		/*  
		* += -= *= /=
		* amount = amount - 50000;		
		* amount -= 50000;
		*/
		
		int tenTh = amount / 10000; // 1만원짜리 지폐 갯수
		amount %= 10000;
		
		int fiveTh = amount / 5000; // 5천원짜리 지폐 갯수
		amount %= 5000;
		
		int oneTh = amount / 1000; // 1천원짜리 지폐 갯수
		amount %= 1000;
		
		System.out.println("50000원 : " + fiftyTh);
		System.out.println("10000원 : " + tenTh);
		System.out.println("5000원 : " + fiveTh);
		System.out.println("1000원 : " + oneTh);
		}
		
		
		public void practice3() {
		/*
		 * 사용자로부터 두 개의 정수를 입력받아,
		 * 첫 번째 수가 두 번째 수의 배수인지 확인하고 
		 * 결과를 출력해라
		 * 만약 배수라면 "배수입니다"를 출력하고, 
		 * 아니라면 "배수가 아닙니다"를 출력
		 * */
	
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("첫 번째 수 : ");
			int num1 = sc.nextInt();
			
			System.out.printf("두 번째 수 : ");
			int num2 = sc.nextInt();
			
			// 첫번째 수가 두번째 수의 배수인지
			// == 첫번째 수가 두번째 수로 나누어 떨어진다는 뜻
			// == 첫번째 를 두번째로 나누었을때 나머지가 0이다.
			String result = num1 % num2 == 0 ? "배수입니다" : "배수가 아닙니다";
			
			System.out.println(result);
		}
	}
