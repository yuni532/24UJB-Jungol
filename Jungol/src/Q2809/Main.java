package Q2809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		for(int i =1;i<=A;i++) {
			if (A%i==0) {
				System.out.print(i+ " ");
			}
		}

	}

}
 // 길어서 오류 난다고 함 시간초과로
