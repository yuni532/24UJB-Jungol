package Q1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A>B) {
			for (int i=A;i>=B;i--){
				for(int j=1;j<=9;j++) {
					System.out.print(i + " * " + j + " =");
					System.out.printf("%3d",(i*j));
					System.out.print("   ");
					if(j%3==0) {
						System.out.println("");
					}
				}
					System.out.println("");
			}
		} else {
			for (int i=A;i<=B;i++){
			for(int j=1;j<=9;j++) {
				System.out.print(i + " * " + j + " = " );
				System.out.printf("%3d",(i*j));
				System.out.print("   ");
				if(j%3==0) {
					System.out.println("");
				}
			}
				System.out.println("");
		}
			
		}
		

	}

}
