package Q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C=1;
		for (int i=0; i<A;i++) {
			for(int j=0;j<B;j++) {
				System.out.print(C + " ");
				C++;
				
			}
			System.out.println("");
		}

	}

}
