package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		/* 사용자로부터 한 개의 값을 입력 받아 
		 * 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1 미만의 숫자가 입력됐다면 
		 * “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * */
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.printf("1 이상의 숫자를 입력해주세요.");
		} else {
		
			for(int i = 1; i <= input; i++) {
				System.out.printf(i+" ");
			}
		}
	}
	
	public void practice2() {
		
		/* 사용자로부터 한 개의 값을 입력 받아 
		 * 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * */
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.printf("1 이상의 숫자를 입력해주세요.");
		} else {
		
			for(int i = input; i >= 1; i--) {
				System.out.printf(i+" ");
			}
		}
	}
	
	public void practice3() {
		
		/* 1부터 사용자에게 입력 받은 수까지의 
		 * 정수들의 합을 for문을 이용하여 출력하세요.
		 */
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		String result = "";
		
		for(int i = 1; i <= 20; i++) {
			
			if(i <= input) { // 배수일 때
				result += i + " + "; // result = result + (3 + " ") "3 " --> "3 6"
				sum += i; // 합계 누적
			} 
		}
		System.out.printf("%s", result);
		System.out.printf("= %d  ", sum);
	}
	
	public void practice4() {
		
		/* 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * */
		
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		
		System.out.println();
		
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		System.out.println();
		
		if(input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = input1; i <= input2; i++ ) {
				System.out.print(i+" ");
			
			
				} for(int i = input2; i <= input1; i++ ) {
					System.out.print(i+" ");
			}
		}
	}	
	
	public void practice5() {
		
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		System.out.print("숫자 : ");
		int result = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n",result);
		
			for(int dan = result; dan <= result ; dan++) { // 입력한 단까지
			
			for(int num = 1; num <= 9; num++) { // 각 단에 곱해질 수 1 ~ 9 까지 차례대로 증가
				System.out.printf("%d * %d = %d\n", dan, num, dan * num);
			}
		}
	}
	
	public void practice6() {
		
		/* 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		 * */
		
		System.out.print("숫자 : ");
		int result = sc.nextInt();
		
			for(int dan = result; dan <= 9 ; dan++) { // 입력한 단까지
				System.out.printf("===== %d단 =====\n",dan);
			for(int num = 1; num <= 9; num++) { // 각 단에 곱해질 수 1 ~ 9 까지 차례대로 증가
				System.out.printf("%d * %d = %d\n", dan, num, dan * num);
			} 
		}
	}
	
	public void practice7() {
		/* 다음과 같은 실행 예제를 구현하세요.
		 * 이중 for 문 작성
		 * Ex) 
		 * 정수 입력 : 4
		 * *
		 * **
		 * ***
		 * ****
		 * 
		 * - 행(row)은 입력한 input 만큼 
		 * - 열(col) 은 현재행(row)만큼 반복
		 * */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
	 
		for(int row = 1; row <= input; row++) { // 행 --> 내가 입력한 숫자까지 행 생성
			
			for(int col = 1; col <= row; col++) { // 열  문제에서 열은 행 따라 감.
				System.out.print("*");
			} 
			System.out.println(); // 헌 행의 모든 열 출력이 끝나면 줄바꿈
		}
	}
	
	public void practice8() {
		
		/*다음과 같은 실행 예제를 구현하세요.
		 * ex.
		 * 정수 입력 : 4
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
	 
		for(int i1 = input; i1 >= 1; i1--) { // 행 --> 내가 입력한 숫자까지 행 생성
			for(int i2 = i1; i2 >= 1; i2--) { // 열  문제에서 열은 행 따라 감.
				System.out.printf("*", i2);
			} System.out.println();
		}
	}
	
	public void practice9() {

		/*
		 * 
		 * 정수 입력 : 4
		 
		 	*
	 	   **
		  ***
		 ****
		 
		 * 
		 * 
		 * - 공백 부분이 input 보다 1 작은수에서 시작하여 1씩 감소하는것 처럼 보임
		 * 
		 * - * 부분은 현재행(row)만큼 찍힌것으로 보임
		 * 
		 */


		System.out.print("정수 입력 : ");
		int input = sc.nextInt();


        for (int row = 1; row <= input; row++) {  // row는 1부터 input까지 증가
        	
            for (int space = 1; space <= input - row; space++) { // 공백 출력 (input - row 개)
                System.out.print(" ");
            }
            
            for (int col = 1; col <= row; col++) { // 별 출력 (i 개)
                System.out.print("*");
            
            }	System.out.println(); // 줄 바꿈
        }
	}

	public void practice10() {

		/*
		 * 
		 * 정수 입력 : 3
		 
		 *
		 **
		 *** (여기까지 위쪽삼각형)
		 **
		 *
		 
		 
		 * - 위쪽삼각형 : 행(row)은 input 만큼 반복, 열(col)은 현재행(row)만큼 반복 
		 * - 아래삼각형 : 행(row)은 input 보다 1 작은수에서부터 1씩 감소하며 반복 
		 * 					열(col)은 현재행(row)만큼 반복
		 * 
		 * 두개 합치기!
		 * 
		 */

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 위쪽삼각형
		for (int row = 1; row <= input; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			
			}	System.out.println(); // 줄바꿈
		}
		// 아랫쪽삼각형
		for (int row = input - 1; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			
			}System.out.println(); // 줄바꿈
		}
	}

	public void practice11() {
		// 왼쪽 공백 + 가운데 정렬된 * 개수 증가 방식으로 구현
		// 즉, 공백 + 별 개수(홀수 개) 형태의 피라미드 모양
		/*
		 * 정수 입력 : 4 
		 * 
		       *
			  ***
			 *****
			*******
		 * */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // 4일때
		
		 for (int row = 1; row <= input; row++) { // 행(row) 1 ~ input 까지 1씩 증가
			 
            for (int space = 1; space <= input - row; space++) { // 왼쪽 공백 출력(input - row 개 출력 (맨 위가 가장 많고, 아래로 갈수록 줄어듦)
                System.out.print(" "); 
            }
            // 왼쪽 공백 출력 끝났으면 
            // 이제 아래 별 출력
            for (int col = 1; col <= (2 * row - 1); col++) { // 별 출력
                System.out.print("*");
            
            }  System.out.println(); // 줄 바꿈
        }
	}
	
	public void practice12() {

		/*
		 * 
		 * 정수 입력 : 5
		 *****
		 *   * 
		 *   * 
		 *   *
		 *****
		 * 
		 * - input == row(행) - 1행과 input행은 "*" 출력 
		 * - 1열과 input열은 "*" 출력
		 * 
		 * 
		 */


		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int row = 1; row <= input; row++) {

			for (int col = 1; col <= input; col++) {

				// 첫 번째 / 마지막 행, 첫 번째, 마지막 열 * 출력
				if (row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");

				} else { // 나머지는 공백 출력
					System.out.print(" ");
				}
			}	System.out.println();
		}
	}

	public void practice13() {
		/*
		 * 
		 * 1부터 사용자에게 입력 받은 수까지 중에서 
		 * 1) 2와 3의 배수를 모두 출력하고 
		 * 2) 2와 3의 공배수의 개수를 출력하세요.
		 * 
		 * ex) 자연수 하나를 입력하세요 : 15 
		 * 2 3 4 6 8 9 10 12 14 15 
		 * count : 2
		 */

		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= input; i++) {

			// 2의 배수 또는 3의 배수인 경우 출력
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");

				// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다.
				if (i % 2 == 0 && i % 3 == 0) {
					// 갯수세기
					count++;
				}
			}
		}	System.out.println("\ncount : " + count);
	}	
}