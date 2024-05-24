package Q573;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();
	//	int[] ar = new int [A];
		int B=1;
		for (int i=0;i<A;i++) {
		for (int j=0;j<A;j++) {
			System.out.print(B+" ");
			B++;
		
		}
		System.out.print("\n");
		}
	}
}

