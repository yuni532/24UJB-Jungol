package Q5933;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	
	for (int i =1;i<=A;i++) {
	
		for (int j=1;j<=A;j++) {
			System.out.print(j*i+" ");
		}
	
		System.out.println("");
	}
	}

}
