package Q131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 int A = sc.nextInt();
		 int B = sc.nextInt();
		
		 if (A>=B) {
			 for (int i=B;i<=A;i++) {
				 System.out.print(i+" ");
			 }
		 }if (B>A) {
				 for(int i=A;i<=B;i++) {
					 System.out.print(i+ " ");
				 
			 }
		 }

	}

}
