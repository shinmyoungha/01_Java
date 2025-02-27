package beakjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int Q = C / 60; // B 추가 시간
		int W = C % 60; // A 추가 분

		if (B + W > 60) {
			if (B + W >= 60) {
				System.out.printf("%d %d", A + ((B + C) / 60), (B + W) % 60);
			} else if (B + W < 60) {
				System.out.printf("%d %d", A + ((B + C) / 60), (B + W));
			}
		} 
	}
}
