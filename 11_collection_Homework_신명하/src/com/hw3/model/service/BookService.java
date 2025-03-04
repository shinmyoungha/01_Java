package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	// 필드 작성
	// private 를 쓴 이유는 캡슐화를 위해서 썼음
	private Scanner sc = new Scanner(System.in);
	
	// 책을 저장할 List 생성
	private List<Book> List = new ArrayList<>();
	
	// 즐겨찾기(BookMakr) 저장할 List 생성
	private List<Book> BookMark = new ArrayList<>();
	
	// BookService에 5개 리스트 생성
	public BookService() {
		List.add( new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원") );
		List.add( new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개") );
		List.add( new Book(3333, "역행자", "자청", 17550, "웅진지식하우스") );
		List.add( new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들") );
		List.add( new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스") );
	}
	
	public void ex1() {
		try {
			// menuNum 이 0일때 종료
			int menuNum = 0;
			
			// 무조건 한 번은 실행되야 하기 때문에 do - while 문 작성
			do {
				// 아래 코드는 처음에 무조건 나옴
				System.out.println("===도서 목록 프로그램==="); // 출력
				System.out.println("1. 도서 등록");	// 출력
				System.out.println("2. 도서 조회"); // 출력
				System.out.println("3. 도서 수정"); // 출력
				System.out.println("4. 도서 삭제"); // 출력
				System.out.println("5. 즐겨찾기 추가"); // 출력
				System.out.println("6. 즐겨찾기 삭제"); // 출력
				System.out.println("7. 즐겨찾기 조회"); // 출력
				System.out.println("8. 추천도서 뽑기"); // 출력
				System.out.println("0. 프로그램 종료"); // 출력
				
				System.out.print("메뉴를 입력하세요 : "); // 출력
				
				menuNum = sc.nextInt(); // 정수형 입력받아서 menuNum에 대입
				
				// 스캔받은 menuNum을 switch 에 대입 
				switch(menuNum) {
				case 1 : System.out.println( addBook() ); break; // menuNum 값이 1이면 addBook 실행
				case 2 : showBookList(List); break; // menuNum 값이 2면 리스트 보여줌
				case 3 : System.out.println( editBook() ); break; // menuNum 값이 3이면 editBook 실행				
				case 4 : System.out.println( deletBook() );break; // menuNum 값이 4이면 deletBook 실행 
				/*
				case 5 : addBookMark();break;
				case 6 : deletBookMark(); break;
				*/				
				case 7 : showBookList(BookMark); break; // menuNum 값이 7이면 BookMark 실행				
				case 8 : randomBook(); break;  // menuNum 값이 이면 랜덤 책 추천
				case 0 : break; // menuNum 값이 0이면 끝냄 이유는 위에서 0이면 프로그램 종료라고 선언했기 때문에
				default : System.out.println("메뉴에 있는 번호만 입력하세요"); // 출력
				}
				// 아까 menuNum 을 0으로 설정했는데 바로 끝나며 안되니까 0이 아닐 경우를 함 
			} while(menuNum != 0);
			// try 에서 던져진 예외를 catch 문의 매개변수 e 로 잡음
		} catch(Exception e) {
			System.out.println("예외 발생"); // 예외가 발생하면 출력함
			e.printStackTrace(); // 예외 발생 지점 추적 메서드
		}
	}

	// 도서 추가
	private String addBook() {
		
		System.out.println("====도서 등록===="); // 출력

		System.out.print("도서 번호 : "); // 출력
		int bookNum = sc.nextInt(); // 정수 입력 받기 위함
		sc.nextLine(); // 개행 문자 제거
		
		System.out.print("도서 제목 : "); // 출력
		String title = sc.nextLine(); // 문자열 입력 받기 위함(공백 포함)
		
		System.out.print("도서 저자 : "); // 출력
		String writer = sc.nextLine(); // 문자열 입력 받기 위함(공백 포함)
		
		System.out.print("도서 가격 : "); // 출력
		int price = sc.nextInt(); // 정수 입력 받기 위함
		sc.nextLine(); // 개행 문자 제거
		
		System.out.print("도서 출판사 : "); // 출력
		String publisher = sc.nextLine(); // 문자열 입력 받기 위함(공백 포함)
		
		// 클래서 생성자 = 새로운 객체 생성
		// 새로운 객체 Book를 생성해서 책 제목, 저자, 가격.. 등등 전달
		Book newBook = new Book(bookNum, title, writer, price, publisher);
		
		// 리스트에 새로운 객채를 추가함
		List.add(newBook);
		
		// 새로운 객체를 추가했으면 등록 완료라는 걸 리턴함
		return "등록 완료";
	}
	// Book 에 List 를 보여줘라
	public void showBookList(List<Book>list) {
		
		if(list.isEmpty() ) { // 컬렉션이 비어 있는지 조사
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요");
		} else {
			// 향상된 for 문
			// 자료형 변수명 : 배열명
			//  Book   temp  :  List 
			for(Book temp : list) {
				System.out.println(temp); // temp 출력
			}
		}
	}
	
	// 도서 수정
	public String editBook() {
		showBookList(List); // 리스트를 보여줘라
		System.out.println("====도서 수정===="); // 출력
		int editMenu = 0;  // editMenu = 0으로 선언
		
		System.out.println("===수정할 도서 번호를 입력하세요 : "); // 출력
		int bookNum = sc.nextInt(); // 정수 입력 받기 위함
		
		// flag 값이 참이면 아래 코드 수행
		boolean flag = true;
		
		// 향상된 for 문
		// 자료형 변수명 : 배열명
		//  Book   temp  :  List 
		for(Book temp : List) {
			// 만약 temp.getBookNum()이 bookNum과 같다면 아래 코드 수행
			if(temp.getBookNum() == bookNum) {
				System.out.println("1. 도서 명"); // 출력
				System.out.println("2. 도서 저자"); // 출력
				System.out.println("3. 도서 가격"); // 출력
				System.out.println("4. 도서 출판사"); // 출력
				System.out.println("0. 수정 종료"); // 출력
				System.out.println("어떤 정보를 수정하시겠습니까?"); // 출력
				
				editMenu = sc.nextInt(); // editMenu 입력 받아라
				
				switch(editMenu) { // editMenu 값을 switch 에 넣으셈
				
				// 값이 1이면 아래 코드 수행
				case 1 :
					System.out.println("====도서명 수정===="); // 출력
					System.out.println("수정할 도서명을 입력하세요 : "); // 출력
					String title = sc.next(); // title 에 문자열 입력
					temp.setTitle(title); // temp 이라는 변수에 title 넣음
					break; // 멈춤
					
				// 값이 2면 아래 코드 수행
				case 2 :
					System.out.println("====도서 저자 수정===="); // 출력
					System.out.println("수정할 저자명을 입력하세요 : "); // 출력
					String writer = sc.nextLine(); // writer 에 문자열 입력(공백 포함)
					temp.setTitle(writer); // temp 이라는 변수에 writer 넣음
					break; // 멈춤
					
				// 값이 3이면 아래 코드 수행
				case 3 :
					System.out.println("====도서 가격 수정===="); // 출력
					System.out.println("수정할 가격을 입력하세요 : "); // 출력
					String price = sc.next(); // price 에 문자열 입력 받음
					temp.setTitle(price); // temp 이라는 변수에 price 넣음
					break; // 멈춤
					
				// 값이 4면 아래 코드 수행
				case 4 :
					System.out.println("====도서 출판사 수정===="); // 출력
					System.out.println("수정할 출판사를 입력하세요 : "); // 출력
					String publisher = sc.next(); // publisher 에 문자열 입력 받음
					temp.setTitle(publisher); // temp 이라는 변수에 publisher 넣음
					break; // 멈춤
					
				// 값이 0이면 아래 코드 수행
				case 0 : System.out.println("종료합니다"); break; // 출력
				
				// 다른 값이면 아래 코드 수행
				default : System.out.println("메뉴에 있는 번호만 선택하세요"); break; // 출력
				}
			}
		}
		// 만약 flag 값이 참이 아니라면 아래 코드 수행
		if(flag) {
			return "일치하는 도서 번호가 없습니다";
		} // flag 값이 참이면 위에 코드를 실행하고 아래 return 수행
		return "수정 완료";
	}
	
	// 도서 삭제
	public String deletBook() {
		System.out.println("====도서 삭제===="); // 출력
		
		// 리스트를 보여줘라
		showBookList(List);
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : "); // 출력
		int deleteNum = sc.nextInt(); // 정수 입력 받기 위함
		
		// 향상된 for 문
		// 자료형 변수명 : 배열명
		//  Book   temp  :  List 
		for(Book temp : List) {
			int index = List.indexOf(temp); // 인덱스에 특정 문자를 찾아서 넣는다.
			
			System.out.println("index 번호 : " + index); // 출력
			System.out.print("정말 삭제하시겠습니까? (Y/N) : "); // 출력
			char answer = sc.next().toUpperCase().charAt(0); // 소문자를 대문자로 바꿔주는 명령어
			
			if(answer == 'Y') { // answer 이 'Y'와 같다면 아래 코드 실행, 
								// 작은따옴표? 홑따옴표? 쓰는 이유는 위에서 answer 을 char 로 선언했기 때문이다 
				List.remove(index); // List 의 index 번째를 삭제해라 
				break; // 멈춤
			} else {  // answer 이 'Y' 같지 않다면 아래 코드 실행
				return "삭제를 진행하지 않습니다";
			}
		}
	
	return "삭제 끝"; // 위에서 리스트에서 도서를 성공적으로 삭제하면 return 출력
	}
	
	public void randomBook() { 
		int max = List.size(); // 제일 큰 수는 리스트의 끝 인덱스 번호이다
		int random = (int)(Math.random() * max); // 0번부터 리스트의 끝 인덱스번호
		System.out.println( List.get(random).getTitle() ); // List 의 랜덤한 책의 제목을 출력
	}
}