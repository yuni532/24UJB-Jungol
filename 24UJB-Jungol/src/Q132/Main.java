package Q132;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int A = sc.nextInt();
	int C=0;
	for (int i=1;i<=A;i++) {
		if (i%5 == 0) {
		 C += i;
			
		}
	}
	System.out.print(C);
	}

}
