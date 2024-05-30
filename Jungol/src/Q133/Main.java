package Q133;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B;
		int C = 0;
		for(int i=1;i<=A;i++) {
			B = sc.nextInt();
			C+= B;
			
		}
		double D= (double) C/A;
		System.out.printf("%.2f", D);

	}

}
