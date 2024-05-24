package Q576;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		char Q = sc.next().charAt(0);
		int B = sc.nextInt();
		
		//System.out.print ( A + " " +Q+" " + B);
//		String W = sc.next();
//		String E = sc.next();
//		String R = sc.next();
		sc.close();
		if (Q=='+') {
			System.out.print(A+" "+ Q  + " "  + B + " = "+ (A+B));
		}else if (Q=='-') {
			System.out.print(A+" " +  Q+ " "  + B + " = "+ (A-B));
		}else if (Q=='*') {
			System.out.print(A+" " + Q +" " + B + " = "+ (A*B));
		}else if (Q=='/') {
			System.out.print(A+" "+ Q +" " + B + " = "+ (A/B));
		
		} else {
			System.out.print(A+" "+ Q +" " + B + " = "+ 0);
		}
	
	}

}

