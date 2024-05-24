package Q575;
import java.util.Scanner;
public class Main {
	public static int Num (int p1, int p2) {
		int res = 1;
		
		for (int i = 0; i<p2; i++) {
			res*=p1;
			
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int S = Num(A,B);
		System.out.println(S);
	}

}









//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	Scanner sc = new Scanner(System.in);
//	double A = sc.nextDouble();
//	double B = sc.nextDouble();
//	sc.close();
//	double C = Math.pow(A,B);
//	System.out.printf("%1.0f",C);
//}
//
//}
