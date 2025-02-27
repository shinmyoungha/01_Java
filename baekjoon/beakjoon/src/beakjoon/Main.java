package beakjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		if((H <= 0) || (M <= 45)) {
			System.out.printf("%d %d", (24 - 1),(M + (60 - 45)));
		} else {
			System.out.printf("%d %d",H, M);
			
		}
	}
}
