package beakjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt(); // 시
		int min = sc.nextInt();  // 분
		int inputMinute = sc.nextInt(); // 입력 분

		int plusHour = inputMinute / 60; // 추가 시
		int plusMin = inputMinute % 60; // 추가 분
		
		int finalHour = hour+plusHour; // 최종 시
		int finalMin = min+plusMin; // 최종 분

		//분 >= 60%60		시간+1
		//시간 > 24 %24		
		
		
		if (finalMin >= 60) {
				System.out.printf("%d %d", ((finalHour + (finalMin / 60)) % 24), finalMin % 60);
		}else System.out.printf("%d %d", finalHour % 24, finalMin % 60);


	}
}
