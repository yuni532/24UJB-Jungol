package Q1523;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = 1;

		if (n < 100 && m >0) {

			if (m == 1) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

			if (m == 2) {

				for (int i = n; i > 0; i--) {
					for (int j = 0; j < i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

			if (m == 3) {

				for (int i = n; i > 0; i--) {
					for (int j = i - 1; j > 0; j--) {
						System.out.print(" ");
					}

					for (int k = 0; k < c; k++) {
						System.out.print("*");
					}
					c += 2;

					System.out.println();
				}
			}
		} else {
			System.out.println("INPUT ERROR!");
		}
	}

}
