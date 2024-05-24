package Q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C=1;
		int D=0;
		for (int i=0; i<A;i++) {
			if (i%2==0) {			
			for(int j=0;j<B;j++) {
				System.out.print(C + " ");
				C++;
			}
			} else {
				for(int j=B;j>0;j--) {
					if(j==B) {
					D= (j*(i+1));}
					
					System.out.print(D-- + " ");
				C++;
				}
				
			}
			System.out.println("");
		}

	}

}
