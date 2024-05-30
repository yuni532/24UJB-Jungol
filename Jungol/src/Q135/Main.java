package Q135;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		int cnt =0;
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A<B) {
			
		for (int i =A;i<=B;i++ ) {
			if(i%3==0) {
				sum += i;
			cnt ++;
			} else if(i%5==0) {
				sum+=i;
			cnt++;
			}
		}
		}
		if(A>=B) {
			
		for (int i =B;i<=A;i++ ) {
			if(i%3==0) {
				sum += i;
			cnt ++;
			} else if(i%5==0) {
				sum+=i;
			cnt++;
			}
		}
		}
		
		
		avg = (double) sum/cnt ;
		System.out.println("sum : " + sum);
		System.out.print("avg : ");
		System.out.printf("%.1f", avg);

	}

}
