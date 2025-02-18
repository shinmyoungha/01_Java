package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService { // 기능 제공 클래스

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 짝수
		 * 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 * 
		 * 
		 * [실행 화면] 1 2 3 4 5 6 7 8 9 짝수 번째 인덱스 합 : 25
		 */

		int arr[] = new int[9]; // 배열
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.printf(" " + arr[i]);

			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum); // sum이 있어야 할거 같은 느낌
	}

	public void practice2() {

		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 홀수
		 * 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 */

		int arr[] = new int[9]; // 배열
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;
			System.out.printf(" " + (arr.length - i));

			if (i % 2 == 1) {
				sum += arr[i];
			}
		}

		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum); // sum이 있어야 할거 같은 느낌
	}

	public void practice3() {

		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 * 
		 */

		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int arr[] = new int[input];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;
			System.out.printf(" " + arr[i]);
		}
	}

	public void practice4() {

		/*
		 * 정수 5개를 입력 받아 배열을 초기화 하고 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력. 배열에 같은 수가
		 * 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		 * 
		 */

		int arr[] = new int[5];
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {

			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			arr[i] = input; // arr[i] --> i에 input 넣기
		}

		System.out.print("검색할 값 : ");
		int input2 = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input2) { // arr[i]번째 값이랑 input2 값 비교
				System.out.print("인덱스 : " + i);
				flag = false;
			}
		}

		if (flag) {
			System.out.println("존재하지않음");
		}
	}

	public void practice5() {

		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		 * 검색할 문자가 문자열에 몇 개 들어가 있는지 
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를
		 * 출력하세요.
		 * 
		 * 
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) : 4 8
		 * i 개수 : 2
		 */

		// 1. 사용자에게 문자열 입력받기
		// 2. 사용자가 입력한 문자열을 하나하나 char 배열에 넣기
		// -> 사용자가 입력한 문자열의 길이만큼의 char배열을 할당
		// 3. 문자 입력받기(검색할 문자)
		// 4. 검색할 문자가 문자열에 몇개가 존재하는지, 어느 인덱스에 있는지 파악

		System.out.print("문자열 : ");
		String input1 = sc.nextLine();
		String str = "";

		char[] arr = new char[input1.length()];
		
		// 반복문을 통해서 input1.chatAt(i) 값을 arr[i]에 담는 과정
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input1.charAt(i); // application

		}
		// 3. 문자 입력받기 (검색할 문자)
		System.out.print("문자 : ");
		char input2 = sc.next().charAt(0);

		// 4. 검색할 문자가 문자열에 몇개가 존재하는지, 어느인덱스에 있는지 파악
		int count = 0; // 검색할 문자가 몇개 들어있는지 세어줄 변수
		// 문자열에서 동일한 문자가 발견될때마다 1씩 증가

		// arr 배열의 인덱스마다 접근하기 위해 반복문 사용
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == input2) { // 해당 인덱스 값이 검색될 문자와 같을 경우
				str += i + " ";
				count++;
				// arr[i] 값과 검색할 문자 ch가 같은 경우
				// 카운트를 늘려라!
			}
		}

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s", input1, input2, str);
		// char 형태는 %c, String 형태는 %s
		System.out.println();
		if (count > 0) { // 일치하는 값 있음
			System.out.printf(input2 + " 개수 : %d", count);
		}
	}

	public void practice6() {

		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의
		 * 인덱스에 값을 초기화 하세요. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 * 
		 */

		System.out.print("정수 : ");
		int sum = 0;

		int input1 = sc.nextInt();
		int arr[] = new int[input1];

		String str = "";

		for (int i = 0; i < input1; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int input2 = sc.nextInt();

			arr[i] = i;
			sum += input2;
			str += input2 + " ";

		}
		System.out.printf("%s\n", str);
		System.out.printf("총합 : %d", sum);
	}

	public void practice7() {

		// 주민등록번호 번호를 입력 받아 성별을
		// 나타내는 숫자 이후부터 *로 가리고 출력하세요.

		System.out.print("주민등록번호(-포함) : ");

		String input = sc.next(); // String 쓴 이유는 -가 있어서

		// 배열 생성 내가 입력한 길이만큼
		char arr[] = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			// input.chatAt() : 문자열에서 특정
			// index에 위치한 문자하나 얻어옴.
			arr[i] = input.charAt(i);

		}

		for (int i = 0; i < arr.length; i++) {
			if (i <= 7) {
				System.out.print(arr[i]); // i가 7이하면 배열 그대로 출력
			} else {
				System.out.print("*"); // i가 7이하가 아니라면 *로 표시
			}
		}
	}

	public void practice8() {

		/*
		 * 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여
		 * 내림차순으로 값을 넣어 출력하세요. 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록
		 * 하세요.
		 * 
		 */

		System.out.print("정수 : ");

		int input = sc.nextInt(); // 정수 값 입력
		int num = 0;
		
		// 입력한 정수 값을 2로 나눈게 1이고 &&(and연산) 
		// 입력한 정수가 3보다 크거나 같다
		if (input % 2 == 1 && input >= 3) { 
			int arr[] = new int[input];
			
			// i가 0부터 시작 i가 arr 길이보다 작을때 실행
			for (int i = 0; i < arr.length; i++) {

				// 입력한 값이 2로 나눴을때 i번째보다 크거나 같은가
				if (input / 2 >= i) {
					num++; // 위 조건이 충족하면 num을 더한다
					arr[i] = num; // arr i번째 자리에 num 대입
					System.out.print(num); // num 출력
					
				} else { // if의 조건식이 충족하지 않았다면
					num--; // num 빼기
					arr[i] = num; // arr i번째 자리에 num 대입
									
					System.out.print(num); // num 출력
				}
			}
		} else { // 아무것도 아니라면 아래 출력
			System.out.println("다시 입력하세요.");
		}
	}
	
	public void practice9() {
		
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 
		 * 선언 및 할당하고,
		 * 1~10 사이의 난수를 발생시켜 배열에 
		 * 초기화한 후 출력하세요.
		 * */
		
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {

		int random = (int)(Math.random() * 10 + 1); 
						
		 num[i] = random;
						
			}
		System.out.println(Arrays.toString(num) );
		}
	
	public void practice10() {
		
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 
		 * 선언 및 할당하고,
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		 * 
		 * */
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {

		int random = (int)(Math.random() * 10 + 1); 
		num[i] = random;			
				}
			
			int max = num[0];
			int min = num[0];
			
			for (int i = 0; i< num.length; i++) {
				// 0 1 2 3
				
				// 최고점을 비교
				if(num[i] > max) {
					max = num[i];
				}
				// 최저점을 비교
				if(num[i] < max) {
					min = num[i];
				}
			}
			System.out.println(Arrays.toString(num) );
			System.out.println("최고점 : " + max);
			System.out.println("최저점 : " + min);
		}
	
	public void practice11() {
		
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 
		 * 선언 및 할당하고 1~10 사이의 난수를 
		 * 발생시켜 중복된 값이 없게 배열에 
		 * 초기화한 후 출력하세요.
		 * 
		 * */
				
		// 1) 정수 6개 저장할 배열 선언 및 할당
		int [] num = new int[10];
				
		for(int i = 0; i < num.length; i++) {
					
			// 3) 1 ~ 45 사이 난수 생성
			int random = (int)(Math.random() * 10); // 0 ~10
			
			// 4) 생성된 난수를 순서대로 배열 요소에 대입
			num[i] = random;
		}
		// 결과 출력
		System.out.println(Arrays.toString(num) );
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		
		// char 배열에 모든 글자 넣고 중복값을 출력만 하지 않는 방식
		
		// 1. 사용자에게 문자열 입력받기
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 2. 해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 3. char 배열에서 중복값 존재할 경우 출력 x
		int count = 0; // 문자 개수 세기용 변수
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i < arr.length; i++) {
			boolean flag = true; // 중복 체크요 flag 변수
			
			// 중복 값이 있는지 검사하는 for
			for(int j = 0; j < i; j++) {
				
				if(arr[i] == arr[j]) {
					flag = false ; // 중복 발생했을 때
					break;
				}
			}
			
			if(flag) { // 중복이 발생하지 않았을 경우
				
				// if문
				if(i == 0) { // 첫번째 글자
					System.out.print(arr[i]);
				} else { // 0번 인덱스가 아닌 글자
					System.out.print(", " + arr[i] );
				}
				
				count++; // 중복 아닐때만 count 갯수 늘리
				
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}
	
	public void practice14() {
		
		/*
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		 * 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		 * 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		 * 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		 * 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		 * 
		 * 
		 * [실행 화면]
		 * 배열의 크기를 입력하세요 : 3
		 * 1번째 문자열 : 자바의 정석
		 * 2번째 문자열 : 알고리즘
		 * 3번째 문자열 : C프로그래밍
		 * 더 값을 입력하시겠습니까?(Y/N) : y
		 * 더 입력하고 싶은 개수 : 2
		 * 4번째 문자열 : 인간관계
		 * 5번째 문자열 : 자기계발
		 * 더 값을 입력하시겠습니까?(Y/N) : y
		 * 더 입력하고 싶은 개수 : 1
		 * 6번째 문자열 : 영단어600
		 * 더 값을 입력하시겠습니까?(Y/N) : n
		 * [자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		 * 
		 * 얕은 복사, 깊은 복사 둘 다 사용해야 함
		 * */
		
		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거

		String[] arr = new String[size];
		
		// 2. 첫 배열에 저장할 문자열 입력받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print( (i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine(); 
		}
		
		// 3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);
			
			// 4. 값을 더 입력할 경우
			if(ch =='y'|| ch == 'Y') {
				
				// 5. 더 입력받을 개수 입력받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				// 6. 새로 값을 입력받은 배열 생성 --> 기존 배열의 크기 + 추가 입력한 개수
				String[] newArr = new String[arr.length + addSize];
				
				// 7. 배열 복사 + 새로운 문자열 입력받기
				for(int i = 0; i < newArr.length; i++) {
					
					if(i < arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 (깊은복사)
						newArr[i] = arr[i]; // 기존 배열 요소 값 복사
						
					} else { // 인덱스의 크기가 기존 배열보다 클 경우(새로운 값 입력)
						System.out.print((i + 1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
						
				}
				
				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소인 newArr 대입 (얕은 복사)
				// 더 입력? y
				// 위 코드를 반복할 때 기존 배열인 arr의 길이를 기준으로 
				// 새 배열(newArr)의 크기를 할당하기 때문에
				arr = newArr;
				
			} else if(ch =='n'|| ch=='N') { // 값을 더 입력하지 않을 경우
				break; // while 반복문 종료
				
			} else { // 잘못 입력한 경우
				System.out.print("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		// 10. 배열값 모두 출력
		System.out.println(Arrays.toString(arr) );
	}
}
