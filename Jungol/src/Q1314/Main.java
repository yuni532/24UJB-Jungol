package Q1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	
	char [][] arr = new char[A][A];
	char str = 'A';

		
	for(int i=0;i<A;i++) {
		if(i%2==0) {
		for(int j=0;j<A;j++) {
			if(str >'Z') str='A';
			arr[j][i]= str++;
		
			
		}
		}
		else if (i%2!=0) {
			for(int j=A-1;j>=0;j--) {
				if(str >'Z') str='A';
				arr[j][i]= str++;
				}
		}
	}
		for(int i=0;i<A;i++) {
			for(int j=0;j<A;j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
		}



}