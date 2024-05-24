package Q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String A = sc.next();
		double B = sc.nextDouble();
		System.out.print("yard? ");
		System.out.print(B + "yard"+ " = ");
		System.out.printf("%.1f", (B * 91.44));
		System.out.print("cm");
		sc.close();
	}

}
