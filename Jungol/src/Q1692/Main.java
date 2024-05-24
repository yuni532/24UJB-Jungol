package Q1692;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C =0;
		
		C = B%10; // 1의 자리수
		System.out.println(A*C); //A랑 1의 자리수랑 곱한 값
		
		C = (B/10)%10; // 10의 자리수
		System.out.println(A*C);//A랑 10의 자리수랑 곱한 값
		
		C=(B/100); // 100의 자리수
		System.out.println(A*C);//A랑 100의 자리수랑 곱한 값
		System.out.println(A*B); // A*B 총 값
	}

}
