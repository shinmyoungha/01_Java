package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 { //기능용 클래스
	
	/*
	 * 배열(Array)
	 * 
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 배열명으로 불러지고
	 *   구분은 index를 이용함(index는 0부터 시작하는 정수)
	 *   
	 * */

	public void ex1() {
		
		// 변수 vs 배열
		
		
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num 이라는 이름을 부여.
	
		
		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수공간에 10 이라는 정수값 대입
		
		// 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		// ----------
		
		// 배열 선언
		int[] arr;
		// int arr[];
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다 **
		
		// 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며
		//		  Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int 형 변수 3칸짜리 int[]을 생성(할당)
		
		// arr = new int[3];
		// int[]    int[]  --> 같은 자료형 == 연산가능
		// Heap 영역에 할당된 공간은 절대 비어있을 수 없다
		
		System.out.println("arr : " + arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// --> Heap 영역에 생성된 공간은 절대 비어있을 수 없다
		// --> JVM 기본값이 들어가져있다
		// boolean : false
		// 나머지 : 0
		// 참조형 : null
		
		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		
		// 배열 사용
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// [10, 50, 100] 실제로 arr 배열이 가진 모든 요소의 값을 알고싶을때
		// Arrays.toString(배열명);
		System.out.println( Arrays.toString(arr) );
	}
	
	public void ex2() {
		
		// 배열 선언 및 할당
		int [] arr = new int[4];  // arr : 참조 변수(주소값 참조)
		
		// arr[0 ~ 3] 전부 JVM에 의해 0으로 초기화 되어있는 상태
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		// arr[4] = 5000;
		// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// 배열의 인덱스 범위를 벗어남 : 길이가 4칸짜리 배열인데, 없는 인덱스 번호인 4에 접근했다
		
		// 코드에서 빨간 줄 에러 : 컴파일 에러
		// 실행 했을 때 발생하는 에러 : 런타임 에러 
		
		// 배열과 for문
		// 배열의 길이(몇 칸 짜리인가) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			// i --> 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
			// arr[0]에 저장된 값 : 100
			// arr[1]에 저장된 값 : 200
			// arr[2]에 저장된 값 : 500
			// arr[3]에 저장된 값 : 1000
		}
		
		// 선언과 동시에 초기화
		int[] arr2 = {1, 2, 3, 4, 5};
		// stack 영역에 int[] 배열 자료형 공간을 4byte 할당하고
		// 그 공간에 arr2라는 이름 부여
		// Heap 영역에 int 5칸짜리 int[]을 생성하고
		// 0번 인덱스부터 각 요소에 1 ~ 5까지 초기화함(대입함)
		// int[] 주소값을 arr2 참조변수가 참조함
		
		System.out.print(Arrays.toString(arr2));
	}
	
	public void ex3() {
		
		//5명의 키(cm) 를 입력받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 163.7
		// 3번 키 입력 : 180.5
		// 4번 키 입력 : 172.5
		// 5번 키 입력 : 167.2
		// 평균 : 177.02cm
		
		Scanner sc = new Scanner(System.in);
		
		double [] height = new double[5]; 
		// double [] 자료형 참조변수 height를 stack영역에 생성하고
		// height에 heap영역에 새로 생성된 double 5칸짜리 배열의 주소를 대입
		
		for(int i = 0; i < height.length; i++) {
			// i --> 0 1 2 3 4
			System.out.print( (i + 1) + "번 키 입력 : "); // 1 2 3 4 5
			height [i] = sc.nextDouble();
			// height[0] = 170.2
			// height[1] = 164.2
			// ...
			// height[4] = 156.2
		}
		
		System.out.println();
		
		double sum = 0; // 합계 저장용 변수
		
		// 배열의 각 요소에 대입되어있는 값을 사용(합계)하는 용도의 반복문
		for(int i = 0; i < height.length; i++) {
			sum += height[i];
			// sum = sum + height[i];
			// sum = 0 + 170.2
			// sum = 170.2 + 164.2
			// ...
			
		}
		System.out.printf( "\n평균 : %.2f cm", sum / height.length);
	}
	
	public void ex4() {
		
		// 입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		// ex)
		// 입력받을 인원 수 : 4
		// 1번 점수 : 100
		// 2번 점수 : 80
		// 3번 점수 : 50
		// 4번 점수 : 60
		
		// 합계 : 290
		// 평균 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int people = sc.nextInt();
		
		// 배열 선언 및 할당
		// 할당할 배열의 크기는 입력받은 인원수 크기만큼(people)
		
		int [] score = new int[people]; 
		
		// 합계 저장용 변수
		int sum = 0;
		
		// score 배열의 각 요소에 입력하는 값 대입 & 합계 누적 용도
		for(int i = 0; i < score.length; i++) {
		
			System.out.print( (i + 1) + "번 점수 입력 : "); 
			score [i] = sc.nextInt();
			// score[0] = 100
			// score[1] = 50
			// score[2] = 30
			// score[3] = 90
			sum += score[i];
		}
		
		// ===============================
		// --> score 배열의 각 요소가 모두 입력한 값으로 대입 완료
		
		// 최저점과 최고점의 기준 설정
		int max = score[0];
		int min = score[0];
		
		for (int i = 0; i< score.length; i++) {
			// 0 1 2 3
			
			// 최고점을 비교
			if(score[i] > max) {
				max = score[i];
			}
			// 최저점을 비교
			if(score[i] < max) {
				min = score[i];
			}
		}
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", (double)sum / score.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
	}
	
	public void ex5() {
		
		// 점심 메뉴 뽑기 프로그램
		String[] arr = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면"};
		
		System.out.printf("오늘 점심 메뉴 : " + arr[ (int)Math.random() * 6 ]);
		// arr[ (int)Math.random() * 6 ]
		// 0 1 2 3 4 5
		// 0.0 <= x < 1.0
		// 0.0 * 6 <= x * 6 < 1.0 * 6
		// 0 <= x < 6
	}
	
	public void ex6() {
		
		// 배열을 이용한 검색 
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇 번 인덱스에 존재하는지 출력
		
		// ex)
		// 정수 입력 : 200
		// 1번째 인덱스에 존재
		
		// 정수 입력 : 5
		// 존재하지 않음
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		boolean flag = false; // for문으로 검사하기 전에는 없다고 가정
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == input) {
				System.out.println(i + "번째 인덱스에 존재"); 
				flag = true; // 일치하는 값이 있으므로 true로 변경
			} 
		}
		
		// flag 상태를 검사
		// flag가 false 라면 일치하는 값을 찾지 못했다라는 의미
		// 그런데 flag가 false라면 if 조건식이 false이므로 수행되지 않음
		// if(조건식) : if문에서 조건식이 부정이면 수행하지 않으므로
		// --> !(Not 연산자 : 부정 논리 연산자) 붙여줌으로써 true로 변경하여
		// () 안에 있는 코드를 수행하도록 함
		
		if(!flag) {
			System.out.println("존재하지않음");
		}
	}
	
	public void ex7() {
		
		// 입력받은 값과 일피하는 값이 있으면 인덱스 번호 출력
		// 없으면 "존재하지 않음" 출력
		
		String [] arr = {"사과", "딸기", "키위", "바나나", "멜론", "아보카도"};
		/*
		 * 과일 입력 : 아보카도
		 * 5번 인덱스에 존재
		 * 
		 * 과일 입력 : 수박
		 * 존재하지 않음
		 * 
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("과일 입력 : ");
		String input = sc.next();
		
		boolean flag = true;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(input) ) { // String 비교시 equals() 사용!
				System.out.println(i + "번째 인덱스에 존재"); 
				flag = false; // 일치하는 값이 있으므로 false로 변경
			} 
		}

		if(flag) {
			System.out.println("존재하지않음");
			}		
	}
	
	public void ex8() {
		
		// String : 참조형
		
		String str = "가나다"; // 리터럴 표기법 ---> String Constant Pool 저장
		String str2 = new String("가나다"); // new 연산자 ---> Heap 새 객체 저장
		
		System.out.println(str); // 주소값?
		System.out.println(str2); 
		System.out.println(str.toString());
		
		//String 클래스의 toString() 메서드가 존재
		// toString 자기 자신을 그대로 반환.
		
		// System.out.println(str); 을 실행하면
		// str.toString() 이 자동으로 호출됨
		// 대입해둔 문자열 값 자체가 반환됨..
		
		// 주소값(객체의 해시코드)을 확인하고 싶다면 아래처럼 사용..
		System.out.println(System.identityHashCode(str));
		
		String[] strArr = {"사과","바나나", "딸기"};
		// 메모리 구조가 어떻게 생겼을까?
	}

	public void ex9() {
		
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 존재하는지 확인
		// 3. 단, 일치하는 문자 없을경우 "존재하지 않습니다" 출력
		
		/*
		 * ex)
		 * 
		 * 문자열 입력 : hello
		 * [h, e, l, l, o]
		 * 검색할 문자 입력 : l / a
		 * 2개 있음 / 존재하지 않습니다
		 * 
		 * */
		
		// 사용해야 하는 기술, 기능
		// 1) 배열 검색
		// 2) 문자열의 길이 구하기 : String.length()
		// ex) "hello".length() --> 5
		
		// 3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자하나 얻어옴.
		// ex) "hello".charAt(1) --> 'e'
		//      01234
		
		// 4) count(숫자세기)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		
		String input = sc.nextLine(); // hello word [h, e, l, l, o, , w, o, r, l, d]
		
		// 1. 입력받은 문자열을 한 글자씩 잘라내어 char 배열에 순서대로 저장하기
		char [] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i); // hello
			// arr[0] = 'h';
			// arr[1] = 'e';
			// arr[2] = 'l';
			// arr[3] = 'l';
			// arr[4] = 'o';
		}
		
		System.out.println(Arrays.toString(arr) );
		
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		System.out.print("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0); // chatAt() 타입은 char을 반환함
		// sc.next --> String형
		// String.charAt(0) --> String의 0번째 인덱스 문자 하나를 추출해서 char 형태로 반환
		// "h"  --> 'h'
		
		int count = 0; // 같은 글자 갯수를 세기 위한 변수
		
		// [h, e, l, l, o] --> 5
		for(int i = 0; i <arr.length; i++) {
			
			if(arr[i] == ch) {
				count++; 
				// arr[i] 값과 검색할 문자 ch가 같은 경우
				// 카운트를 늘려라!
			}
		}
		// 결과 출력
		if(count > 0) { // 일치하는 값 있음
			System.out.println(count + "개 있음");
			
		} else { // 일치하는 값 없음
			// 3. 단, 일치하는 문자 없을 경우 "존재하지 않음" 출력
			System.out.println("존재하지 않음");
		}
	}
}