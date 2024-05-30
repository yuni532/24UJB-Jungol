package Q9050;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int cnt = 0;
		for(int i=1;i<=A;i++) {
			cnt += i;
		}
		System.out.print(cnt);
	}

}
