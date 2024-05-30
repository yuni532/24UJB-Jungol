package Q134;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		int A;
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<10;i++) {
			A = sc.nextInt();
			if(A%2==0) {
				even++;
			}else if(A%2!=0){
				odd++;
			}
		}
		System.out.println("even : "+even );
		System.out.println("odd : "+odd );
		

	}

}
