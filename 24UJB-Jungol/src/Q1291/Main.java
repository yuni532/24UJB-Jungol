package Q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int cnt = 1;
		int A;
		int B;

		for (;;) {
			if (cnt == 10) {
				break;
			}
			A = sc.nextInt();
			B = sc.nextInt();
			if (2 < A && A < 9) {
				if (2 < B && B < 9) {
					cnt = 1;
					for (int j = cnt; j <= 9; j++) {

						if (A < B) {
							for (int k = A; k <= B; k++) {
								System.out.print(k + " * " + cnt + " =");
								System.out.printf("%3d", (k * cnt));
								System.out.print("   ");
								if (k == B) {
									System.out.println("");
								}
							}
						}
					}
				} else if (A > B) {
					if (2 < A && A < 9) {
						if (2 < B && B < 9) {
							for (int k = A; k >= B; k--) {
								System.out.print(k + " * " + cnt + " =");
								System.out.printf("%3d", (k * cnt));
								System.out.print("   ");
								if (k == B) {
									System.out.println("");
								}
							}
						}
						cnt++;
					}
				}

			} else {
				System.out.println("INPUT ERROR!");
			}

		}
	}

}

// A 값을 받고 거기에 9까지 하고 B랑 같아질ㅒㄸ까지
