package Q632;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		int D = (Math.min(A,B));
		int E = (Math.min(D,C));
		
		System.out.println(E);
	}
	
}
