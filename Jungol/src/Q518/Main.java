package Q518;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = (A+B+C);
		int E = D/3;
		sc.close();
		System.out.println("sum : "+ D);
		System.out.println("avg : " + E);
	}

}
