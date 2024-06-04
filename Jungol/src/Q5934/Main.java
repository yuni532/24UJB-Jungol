package Q5934;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		int c = n/2+1;
		if (n<100 && n>0 && n%2!=0) {
		
				
			for (int i=0;i<c;i++) {
				if(i>0) {
					
				for(int k=0; k<i;k++) {
					System.out.print(" ");
				}
				}
				for(int j =i; j<c;j++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			for(int i=1; i<c;i++) {
				for(int k=1;k<c;k++) {
					System.out.print(" ");
				}
				for(int j=0; j<i+1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	
		}else if(n==1){
			System.out.print("*");
		
		}
		else	{
			System.out.println("INPUT ERROR!");
		
		}

	}

}
