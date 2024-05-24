package Q125;
	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();

		sc.close();

		//1. for loop
//		for (int i=1; i<=A; i++) {
//			System.out.print(i+" ");
//		}
//		
//		//2. while loop
//		int j=1;
//		while (j<=A) {
//			//sum+=j;
//			System.out.print(j++ +" ");

	// 3. do ~ while loop
			int k = 1;
			do {
				System.out.print(k+ " ");
	}while (k++ < A);
	}
}

