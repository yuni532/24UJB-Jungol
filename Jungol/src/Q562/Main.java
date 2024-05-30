package Q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A;
		int cnt = 0;
		int avg = 0;
		for(int i =0;i<10;i++) {
			A = sc.nextInt();
			if(i%2!=0) {
				cnt += A;
				
			}else if (i%2==0) {
				avg += A;
			}
			
		}
		System.out.println("sum : "+ cnt);
		System.out.printf("avg : %.1f\n",avg/5.0);
	
	}

}
