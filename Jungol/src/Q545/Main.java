package Q545;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		int sum =0;
		for(int i=0;i<10;i++) {
			int num = sc.nextInt();
			if(num%3==0) {
				cnt ++;
			}
			if(num%5==0) {
				sum ++;
			}
		}
	System.out.println("Multiples of 3 : "+cnt);
	System.out.println("Multiples of 5 : "+sum);
	}
	

}
