package Q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int b = sc.nextInt();
		sc.close();

		if (b >= 18) {
			if (a == 'M') {
				System.out.println("MAN");
			} else {
				System.out.println("WOMAN");
			}
		} else {

			if (a == 'M') {
				System.out.println("BOY");
			} else {
				System.out.println("GIRL");
			}

		}

	}
}

//		
//		if ( A == "M") {
//			if (B <= 18) {
//			System.out.print("BOY");
//			} else {
//			System.out.print("MAN");
//			}
//		}
//		if (A == "F") {
//			if (B<= 18) {
//				System.out.print("GIRL");
//			}else {
//			System.out.print("WOMAN");
//				
//			}
//			
//		}
//		
//	}
//
//}