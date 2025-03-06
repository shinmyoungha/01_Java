package edu.kh.contorl.practice;


import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			
			for(int i = input; i >= 1; i--) {
				System.out.print(i+" ");
			}
		}
	}
		
	public void practice3() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		String result = "+";
		
		for(int i = 1; i <=input; i++ ) {
			
			if(i <= input) {
				result += i + " "; 
				sum += i;
			}
		}
		System.out.printf("%s", result);
		System.out.printf("= %d", sum);
	}
	
	public void practice4() {
		
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		if(input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = input1; i <= input2; i++) {
				System.out.print(i + " ");
			}for(int i= input2; i<=input1; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5() {
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("====" + input +"단 ====" );
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input * i);
		}
	}
	
	public void practice6() {
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int dan = input; dan <= 9; dan++) {
				System.out.print("====" + dan + "단 ====\n");
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
				}
			}
		}
	}
	public void practice7() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = input; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int space = 1; space <= input - row; space ++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
		 for(int col = 1; col <= row; col++) {
			 System.out.print("*");
		 }
		 System.out.println();
		}
		for(int row = input; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int space = 1; space <= input - row; space++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice12() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= input; col++) {
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				} else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void practice13() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if(i % 2 == 0 && i % 3 == 0) {
					count++;
				}
			}
		}
		System.out.println("\ncount : " + count);
	}
}

