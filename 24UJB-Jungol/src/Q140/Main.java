package Q140;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int B =0;	
	int cnt = 0;
		for (int i=0;i<20;i++) {
			int A = sc.nextInt();
			if(A!=0) {
			B+=A;
			cnt++;
			}else {
				break;
			}
		}
		System.out.print(B + " ");
		System.out.print(B/cnt);
	}

}
