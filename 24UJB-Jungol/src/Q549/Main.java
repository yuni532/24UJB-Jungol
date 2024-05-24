package Q549;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int C =0;
		int cnt=0;
		for (int i=1;i<A;i+=2) {
			if(C<A) {
				C+=i;
				cnt++;
			}
		}
		System.out.print(cnt + " ");
		System.out.print(C);

	}

}
