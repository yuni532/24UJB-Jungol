package Q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String score = scanner.nextLine();
		int A = Integer.parseInt(score);
		System.out.println(A);

	//	if (A <= 0) {

			if (A < 0) {
				System.out.println("minus");
				scanner.close();

			}
		}
	}
//}
// 겹치는 거는 위로 올려버림
