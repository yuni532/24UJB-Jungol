package Q1329;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int c= N/2+1;
		int a = 1;
		if(N%2 != 0 && N<100) {
			
		for (int i=0;i<c;i++) {
			if(i>0) {
				
			for(int k=0; k<i;k++) {
				System.out.print(" ");
			}
			}
			for(int j =0; j<a;j++) {
				System.out.print("*");
			}
			a+=2;
			
			System.out.println();
		}
		a-=2;
		for (int i=c-1;i>0;i--) {
			for(int k=i-1; k>0;k--) {
				System.out.print(" ");
			}
			a-=2;
			for(int j =a; j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		
			}
		}else {
			System.out.println("INPUT ERROR!");
		}
	
	}

}
