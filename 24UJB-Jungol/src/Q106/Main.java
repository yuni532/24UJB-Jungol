package Q106;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
	
		sc.close();
		System.out.println(A +" * " + B + " = " + (A * B)  );
		System.out.print(A + " / " + B + " = " + ( A/B ) );
	
	}

}