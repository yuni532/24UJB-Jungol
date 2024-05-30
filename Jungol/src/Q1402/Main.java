package Q1402;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int[]arr = new int[A+1];
	int[]brr = new int[A];
	int j=1;
	
	for(int i=1;i<=arr.length;i++) {
		if(A%i ==0) {
			arr[i] += i; 
			
		}
	}

	for(int i=1;i<arr.length;i++) {
	if(arr[i]>0) {
			for(;;) {
				brr[j] = i;
				j++;
				break;
			}
	}
	
	}
	System.out.print(brr[B]);
	}

}
