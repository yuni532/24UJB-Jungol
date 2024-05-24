package Q572;
	import java.util.Scanner;

	public class Main {
	public static int area(int A) {
		return A*A;
	}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	sc.close();
	double B = (area(A)*3.14);

	System.out.printf("%.2f",B);
	
	}

}

	
