package edu.kh.variable.exe;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		// 문자열(String) 입력
		// 문자열을 3번 입력받아 한줄로 출력하기
		Scanner sc = new Scanner(System.in);
		
		// sc.next()           : 다음 입력된 한 단어를 읽어옴
		//						공백(스페이스, 탭 등) 만나면 입력을 중단
		// sc.nextLine()       : 다음 입력된 한 줄을 읽어옴
		//						공백과 함께 입력된 모든 내용을 입력받음
		//
		
		
		System.out.print("입력 테스트 : ");
		String input1 = sc.nextLine();
		
		System.out.print("입력 테스트 : ");
		String input2 = sc.nextLine();
		
		System.out.print("입력 테스트 : ");
		String input3 = sc.nextLine();
		
		System.out.printf("%s %s %s\n", input1, input2, input3);
		
	}

}
