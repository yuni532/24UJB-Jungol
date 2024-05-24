package Q142;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int A = sc.nextInt();
	int cnt=0;
	for(int i=0;i<(A+A-1);i++) {
		if(i<A) {
			for(int j=0;j<=A;j++) {
				if(i>=j) {
				
			System.out.print("*");
				}
			}

		System.out.println("");
		}
		
	}
	for(int i=A-1;i>0;i--) {
		cnt++;
		for(int j=A-cnt;j>0;j--) {
			System.out.print("*");
		}
		System.out.println("");
	}
	

	}
}
