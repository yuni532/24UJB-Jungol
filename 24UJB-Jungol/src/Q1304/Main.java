package Q1304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int cnt = 1;
		for (int i = 1; i <=A; i++) {
		cnt = i;	
			for (int j=1; j<=A;j++) {
				System.out.print(cnt+" ");
				cnt+=A;
				
			}
		System.out.println("");
		}

	}

}
