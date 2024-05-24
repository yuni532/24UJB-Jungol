package Q141;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	int A = sc.nextInt();
	
	for(int i =1;i<100;i++) {
		int C =(A*i);
	if (C<100) {
		System.out.print(C+ " ");
		if(C%10==0) {
			break;
		}
	}
	}
	}

}
