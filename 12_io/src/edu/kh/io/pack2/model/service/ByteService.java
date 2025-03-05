package edu.kh.io.pack2.model.service;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteService {

	
	/*
	 * 스트림(Stream) : 데이터가 이동하는 통로
	 * 					기본적으로 한 방향 통로
	 * 
	 * Byte 기반 스트림
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * - 최상위 클래스 : InputStream, OutputStream
	 * - 문자열, 이미지, 영상, 오디오, pdf 등
	 *   모든것을 입/출력 할 수 있음
	 *   (단, 통로가 좁다보니 속도가 좀 느림,
	 *    char 형 문자 같은 경우 깨질 우려가 있음)
	 * 
	 * 
	 * 
	 * */
	
	// IO 관련된 코드 IOException이 발생될 가능성이 높다!
	// -> IO관련 코드는 거의 모든 메서드가 throws IOException
	// -> IOException 예외 처리 구문을 작성하는 것이 필수! Checked Exception 이니까
	
	/**
	 * 바이트 기반 스트림을 이용한 파일 출력
	 * + 데이터도 출력
	 */
	public void fileByteOutput() {
		
		// FileOutputStream 참조 변수 선언(OutputStream 상속받은 자식 클래스)
		FileOutputStream fos = null;
		
		try {
			
			// new FileOutputStream ("경로") :
			// -> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// -> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			// 단, 폴더는 생성되지 않음
			// -> 기존 파일이 존재하면 내용을 덮어쓰기함
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트.txt");
			
			// String 의 불변성 문제를 해결한 객체 StringBuilder(비동기)/StrimgBuffer(동기)
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!\n");
			sb.append("1234567890\n");
			sb.append("~!@#$%^&*()_+?\n");
			sb.append("가나다라마바사아\n");
			sb.append("집가고싶다\n");
			sb.append("선생님 저 공부 정말 열심히 할게요~!\n");
			sb.append("진짜로!! 정말로!! 화이팅!!\n");
			
			// 출력방법 1 : 한 글자(2byte)씩 파일로 출력
			
			// StringBuilder -> String 변환 -> charAt() -> char로 변환
			String content = sb.toString();
			/*
			for(int i = 0; i < content.length(); i++) {
				char ch = content.charAt(i);
				fos.write(ch); // 1byte 출력 스트림이 연결된 파일에 ch 쓰기
			}
			*/
			
			// -> 2byte 범주의 문자(영어, 숫자, 기본특수문자 제외)는
			// 바이트 기반 스트림 통과 시
			// 데이터 손실이 발생해서 글자가 깨지는 문제가 발생
			
			// 출력방법 2 : String을 byte[] 변환 후 출력
			
			// ****** 수행 시간 확인*****
			// write() 수행되는 시간 측정
			// Sysyem.nanoTime() : 1970.01.01 오전 09:00부터
			// 현재시간까지의 차이를 ns(nano second)로 반환
			// 1ms(밀리) 	 == 1/1000초
			// 1us(마이크로) == 1/1000ms
			// 1ns(나노)  	 == 1/1000us
			
			// 이전
			long startTime = System.nanoTime();
			
			fos.write( content.getBytes() ); // byte[]로 만들어 반환
			
			// 이후
			long endTime = System.nanoTime();
			System.out.println("[수행 시간] : " + (endTime - startTime) + "ns"); // 66500ns
			
			fos.flush(); // 스트림 안에 남아있는 모든 데이터 밀어냄
			// FileOutputStream에서는 flush() 선택 사항
			
			System.out.println("출력 완료!");
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally{ // try에서 예외 발생 여부 관계 없이 무조건 수행
			
			// 사용완료한 스트림을 제거(닫기, 메모리 반환)하는 코드 작성
			// -> 메모리 누수 방지
			
			try {
				// 스트림이 정상 생성된 경우
				// 스트림을 닫는다 (NullPointerExceotion 방지)
				// colse() 메서드도 IOExceotion을 발생시키기 때문에
				// try - catch 이용하여 예외 처리 필수!
				if(fos != null) fos.close();
				
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 버퍼를 이용한 파일 출력
	 * + BufferedOutputStream 보조 스트림 이용
	 */
	public void bufferedFileByteOutput() {
		
		/*
		 * 버퍼(Buffer)란?
		 * - 데이터를 모아두는 공간, 마치 바구니 같은 메모리 공간
		 * 
		 * 		   BufferedOutputStream / BufferedInputStream
		 * 출력용 보조 스트림(바이트)   / 입력용 보조 스트림(바이트)
		 * 
		 * - FileOutputStream 은 1바이트씩 데이터를 입출력
		 * -> 통로가 좁아서 데이터 입출력시 속도가 느림
		 * 
		 * -> 보조스트림 이용 시 버퍼에 입출력할 내용을 모아서 한번에 입출력!
		 * (내부 버퍼에 데이터를 모아뒀다가 일정 크기가 되면 한 번에 출력)
		 * --> 기반 스트림을 이용하는 횟수가 적어짐
		 * --> 성능, 시간 효율 상승
		 * 
		 * */
		
		FileOutputStream fos = null; // 기반 스트림 참조변수 선언
		BufferedOutputStream bos = null; // 보조 스트림 참조변수 선언
		
		try {
			
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트_Buffered.txt");
			
			// 기반스트림 fos를 이용해서 보조스트림 bos를 생성
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!\n");
			sb.append("1234567890\n");
			sb.append("~!@#$%^&*()_+?\n");
			sb.append("가나다라마바사아\n");
			sb.append("집가고싶다\n");
			sb.append("선생님 저 공부 정말 열심히 할게요~!\n");
			sb.append("진짜로!! 정말로!! 화이팅!!\n");
			
			String content = sb.toString();
			
			long startTime = System.nanoTime();
			
			bos.write( content.getBytes() ); // 버퍼에 저장(파일에 즉시 기록 X)
			
			long endTime = System.nanoTime();
			
			System.out.println("[수행 시간] : " + (endTime - startTime) + "ns"); // 45500ns
			
			bos.flush(); // 스트림 안에 남아있는 모든 데이터 밀어냄
			// 버퍼 내용을 강제로 파일에 기록
			// BufferedOutputStream 사용 시 flush() 필수!
			
			System.out.println("출력 완료!");
			
		} catch(Exception e){
			e.printStackTrace();
			
		} finally {
			
			try {
				if(bos != null) bos.close();
				// 보조스트림(bos) close()시
				// 보조스트림 생성에 사용된 기반스트림(fos)도 같이 close()됨
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 바이트 기반 파일 입력
	 */
	public void flieByteInput() {
		
		// 파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			// FileInputStream 이용시 해당 경로에 반드시 실제 파일이 존재해여한다!
			// -> 존재하지 않으면 FileNotFoundException 발생
			
			// 방법 1. 파일 내부 내용을 1byte씩 끊어서 가져오기
			// -> 2byte 범주의 글자들은 깨지는 문제 발생함
			
			// byte -> 자바에서 정수형
			// 다루기 힘들기 때문에 정수형 기본형인 int로 변환해서 사용
			
			int value = 0; // 읽어온 바이트값을 저장할변수
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				value = fis.read(); // 1byte씩 읽어오기
				// 단, 더이상 읽어올 값이 없으면 -1 반환
				
				if(value == -1) break; // 다 읽어왔으면 반복 멈춤
				
				sb.append( (char)value ); // char로 강제 형변환해서 글자 형태로 sb 추가
				
			}
			System.out.println( sb.toString() ); // 읽어온 내용 콘솔에 출력
			
			// InputStream 은 flush()없음
			// flush()는 출력 스트림에만 관련된 동작
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			// 사용 완료된 Stream 메모리 반환
			try {
				if(fis != null) fis.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
