package Q126;
 import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int B=0;
		int odd = 0,even = 0;
		do {
			B = sc.nextInt();
			
	if (B == 0) {
		break;
	} else if (B%2 == 0) {
		even++;
	
	}else {
		odd++;
	}
		
		} while (B!=0);
		sc.close();
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		
		
		
		}
	}
//int A = sc.nextInt();
//int C = (A%2);
//int even = 0 ,odd = 0;
//
//
//for (;;) {
//	if (A==0) {
//		
//		break;
//		
//	}else if( C!=0) {
//		odd++;
//		
//	}else if (C==0) {
//		even++;
//	} else {
//		break;
//	}
//	System.out.println("even : " + even);
//	System.out.println("odd : " + odd);
//	
//	
//	sc.close();
//}