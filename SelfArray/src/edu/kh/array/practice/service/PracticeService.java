package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
	
		 int arr[] = new int[9];
		 int sum = 0;
		 
		 for(int i = 0; i < arr.length; i++) {
			 arr[i] = i + 1;
			 System.out.printf(" " + arr[i]);
			 
			 if(i % 2 == 0) {
				 sum += arr[i];
			 }
		 }
		 System.out.println();
		 System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		
		int arr[] = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(" " + (arr.length - i));
			
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println();
		 System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(" " + arr[i] );
		}
	}
	
	public void practice4() {
		
		int arr[] = new int[5];
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) {
		System.out.printf("입력 %d : ", i);
		int input = sc.nextInt();
		arr[i] = input;
		
		}
		
		System.out.print("검색할 값 : ");
		int input2 = sc.nextInt();
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == input2) {
				System.out.print("인덱스 : " + i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("존재하지않음");
		}
	}
	
	public void practice5() {
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		 * 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 * 
		 * [실행 화면]
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) : 4 8
		 * i 개수 : 2
		 * */
		
		System.out.print("문자열 : ");
		String input1 = sc.nextLine();
		String str = "";
		
		char[] arr = new char[ input1.length() ];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input1.charAt(i); // application

		}
		
		System.out.print("문자 : ");
		char input2 = sc.next().charAt(0);

		int count = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == input2) { 
				str += i + " ";
				count++;
			}
		}

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s", input1, input2, str);
		
		System.out.println();
		if (count > 0) {
			System.out.printf(input2 + " 개수 : %d", count);
		}
	}
	
	public void practice6() {
		
		System.out.print("정수 : ");
		int sum = 0;
		int input = sc.nextInt();
		int arr [] = new int[input];
		
		for(int i= 0; i < input; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int input1 = sc.nextInt();
			arr[i] = i;
			sum += input1;
		
		}
		
		
		for(int i= 0; i < input; i++) {
			System.out.print(arr[input] + " ");
		}
		System.out.println();
		System.out.print("합계 : " + sum);
	}
}
