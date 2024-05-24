package Q9055;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int C=0;
	for (int i=1; i<A;i++) {
		C+= i;
		if (C>A) {
			System.out.print(i+" ");
			System.out.println(C);
			break;
		}
	}
	}

}
