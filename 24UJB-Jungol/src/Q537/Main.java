package Q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int sum = 0;
		sc.close();
		
//	 for�� loop 		
		for (int i = 1; i <= A; i++) {
			sum += i;
		}
		System.out.println(sum);
// while �� loop
		int sum2 =0;
		int j= 1;
		
		while (j<=A) {
			sum2+= j++;
		}
		System.out.println(sum2);
//	do while �� loop
		int sum3 = 0;
		int k = 1;
		
		do {
			sum3+=k;
		}while (k++<A);
		System.out.println(sum3);
	
	}
}