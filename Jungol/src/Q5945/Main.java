package Q5945;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		int b= 1;
		int c=0;
		int cnt = 1;

			
			for (int i = 1 ; i <=n; i++) {
				if (i%2 == 0) {
					a+=b;
					c= a;
					for (int j = i; j>0; j--) {
						
						System.out.print(a+" ");
						a--;
					} 
					b+=4;
					
				}else {
					a+=c;
					for(int k = i; k>0;k--) {
						System.out.print(a+ " "); 
						a++;
					}
					
				}
				System.out.println();
			}
	
			}

}
