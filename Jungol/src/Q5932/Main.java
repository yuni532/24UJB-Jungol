package Q5932;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	
	for (int i =1;i<=A;i++) {
		if(i%2 !=0) {
		for (int j=1;j<=A;j++) {
			System.out.print(j+" ");
		}
		}else {
			for(int j=A;j>0;j--) {
				System.out.print(j+" ");
			}
		}
		
		System.out.println("");
	}
	}

}
