package Q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, sum = 0;

		for (;;) {
			int inp = sc.nextInt();
			cnt++;
			sum += inp;
			if (inp >= 100) {
				sc.close();
				break;

			}
		}
		System.out.println(sum);
		System.out.printf("%.1f\n", (double) sum / cnt);
	}
}
