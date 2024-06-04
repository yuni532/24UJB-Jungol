package Q1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long to = 1;
		for(int i = n;i >0; i--) {
		to =to * i;
			if (i!=1) {
				
				System.out.println(i+"!" + " = " + i + " * " + (i-1) + "!");
			} else {
				System.out.println(i+"!" + " = " + i);;
			}
			
		}
		System.out.println(to);

	}

}
