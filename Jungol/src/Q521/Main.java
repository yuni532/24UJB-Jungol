package Q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int cnt ;
		int num ;
		cnt=A++;
		num=B--;
//		System.out.print(A);
		System.out.print(A+" " + B+ " " +(cnt*B));
		
	}
}
