package Q1339;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		//System.out.println(n/2);
		char [][]arr = new char [n][n];
		
		
		char chr = 'A';
		for(int i = 0;i<n;i++) {
			for(int j = i;j<n; j++) {
				if (chr >'Z') chr ='A';
				arr[i][j] = chr;
				chr++;
				
				
			System.out.print(arr[i][j]);	
			}
			
			System.out.println("");
			
		}
		
		
	
	}

}
