package Q143;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int A = sc.nextInt();

		 for (int i =0;i<A;i++) {
			 for(int k =0;k<i;k++) 
				 
				 System.out.print(" ");
			 
			 for(int j=0;j<((2*(A-i))-1);j++) 
				 System.out.print("*");
		 System.out.println("");
			 
			} // 3줄
		

		 
		 for(int i=1;i<A;i++) {
		for(int k=0;k<(A-i-1);k++) 
			 System.out.print(" ");
		
			 for(int j=0;j<((2*i)+1);j++) 
				 System.out.print("*");
				 
			 System.out.println("");
			 
		

		 }
			 
		 
		 

	}

}
