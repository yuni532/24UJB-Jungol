package Q529;

 import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int A = scanner.nextInt();
			int B = scanner.nextInt();
		scanner.close();

		System.out.println(B+100-A);
		if ((B+100-A)>0) {
			System.out.print("Obesity");
			
			
		}
		
	}

}
