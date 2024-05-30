package Q602;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] str = new String [5] ;
		
		for (int i = 0;i<str.length;i++) {
			String A = sc.nextLine();
			str[i] = A;
		}
		for (int j = str.length-1;j>=0; j--) {
			System.out.println(str[j]);
		}

	}

}
