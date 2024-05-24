package Q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			Double Base = sc.nextDouble();
			Double Hei = sc.nextDouble();
			Double B =  (Base*Hei)/2;
			
			System.out.print("Base = ");
			System.out.print("Height = ");
			System.out.print("Triangle width = ");
			System.out.printf("%.1f",B);
			System.out.println("");
			System.out.print("Continue? ");
			String Cont = sc.next();
			if ( Cont.equals("Y")) {
			}else if (Cont.equals("y")) {
			
			} else {
				
				break;
			}
		}

	}

}
