package edu.kh.contorl.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc= new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입려하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input < 0) {
			result = ("양수만 입력해 주세요.");
		} else if(input % 2 == 0) {
			result = ("짝수입니다.");
		} else {
			result = ("홀수입니다");
		}
		System.out.println(result);
	}
	
	public void practice2() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어점수 : " + kor);
			System.out.println("수학점수 : " + math);
			System.out.println("영어점수 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(input +"월은 31일까지 있습니다."); break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(input + "월은 30일까지 있습니다"); break;
		case 2 :
			System.out.println(input + "월은 28일까지 있습니다"); break;
		}
	}
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.printf("BIM 지수 : ", BMI);
		
	
		System.out.println(BMI);
		
		if(BMI < 18.5) {
			System.out.print("저체중");
		} else if(BMI >= 18.5 || BMI < 23) {
			System.out.print("정상체중");
		} else if(BMI >= 23 || BMI < 25) {
			System.out.print("과체중");
		} else if(BMI >= 25 || BMI < 30) {
			System.out.print("비만");
		} else {
			System.out.print("고도 비만");
		}
	}
	
	public void practive5() {
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double finsh = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double report = sc.nextDouble();
		
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextDouble();
		
		mid *= 0.2;
		finsh *= 0.3;
		report *= 0.3;
		
		System.out.println("==============결과==============");
		
		if(attendance <= 20 * 0.7) {
			System.out.println("Fail [출석 횟수 부족] (" + (int)attendance + "/20)");
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", mid);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finsh);
			System.out.printf("과제 점수(30) : %.1f\n", report);
			System.out.printf("출석 점수()20 : %.1f\n", attendance);
			
			double sum = mid + finsh + report + attendance;
			
			System.out.printf("총점 :%.1f\n", sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail[점수미달]");
			}
		}	
	}
}
