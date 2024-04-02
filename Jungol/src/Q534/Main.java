package Q534;
	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id= sc.nextLine();
		sc.close();
	if ( id.equals("A")) {
		System.out.print("Excellent");
	}else if ( id.equals("B")) {
		System.out.print("Good");
	}else if ( id.equals("C")) {
		System.out.print("Usually");
	}else if ( id.equals("D")) {
		System.out.print("Effort");
	}else if ( id.equals("F")) {
		System.out.print("Failure");
	}else {
		System.out.print("error");
	}
	}

}
