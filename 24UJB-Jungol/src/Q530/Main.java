package Q530;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int A = scanner.nextInt();

			scanner.close();
			if ( A >= 20) {
				System.out.println("adult");
			} else  {
				System.out.print((20 - A) + " years later");
			}
					
	
	}
}