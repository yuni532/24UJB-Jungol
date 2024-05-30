package Q1658;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int cnt = 0;
		int num = 1;
		
		
		if(A>B) {			
		for(int i=1;i<=A;i++) {
		if(A%i==0 && B%i==0) {
			 cnt = 0;
			cnt += i;
			}
		
		
		}
		} else {
				for(int i=1;i<=B;i++) {
				if(A%i==0 && B%i==0) {
					 cnt = 0;
					cnt += i;
					}
			
		}
		System.out.println(cnt);
	
		
		

	}
}
}
// 최대 공약수는 구하는데 최소 공배수는 아직 못 구하겠음