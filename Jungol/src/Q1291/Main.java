package Q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A;
		int B ;
		
		for(;;) {
			 A= sc.nextInt();
			 B = sc.nextInt();
		if (A<=1||A>=10) {
					System.out.println("INPUT ERROR!");
		}
		else if(B<=1||B>=10) {
				System.out.println("INPUT ERROR!");
		}
	
		if(A>1&&A<10) {
			if(B>1&&B<10) {
				
		if(A<B) {	
		for(int i=1;i<10;i++) {
			for(int j = A;j<=B;j++) {
				System.out.print(j + " * "+ i + " =");
				System.out.printf("%3d",(j*i));
				System.out.print("   ");
			}
			System.out.println("");
		}
		}else {
			for(int i=1;i<10;i++) {
			for(int j = A;j>=B;j--) {
				System.out.print(j + " * "+ i + " =");
				System.out.printf("%3d",(j*i));
				System.out.print("   ");
			}
			System.out.println("");
		}
			
		}
		break;
			}
		}
		}
			
		
		
	}
}

// A 값을 받고 거기에 9까지 하고 B랑 같아질ㅒㄸ까지
