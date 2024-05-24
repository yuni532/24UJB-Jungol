package Q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int sum = 1;
		String str;
		str = sc.nextLine();
		sc.close();
		for (int i=0; i<str.length();i++) {
			char chr = str.charAt(i);
			if(chr==' ') {
				sum++;
			}
				
		}
		System.out.println(sum);

		
		
	}

}

//		String [] A = new String [100];
//		int sum =1;
//		for (int i =0 ;i<A.length; i++) {
//			A[i]=sc.nextLine();
//		}
//		
//		for (int i=0;i<A.length;i++) {
//			if(A[i]==" ") {
//				sum+=1;
//			}
//		}
//		System.out.print(sum);