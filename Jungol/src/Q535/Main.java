package Q535;
	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp = sc.nextDouble();
		sc.close();
		
		switch ((int)inp) {
		case 4:
			System.out.println("scholarship"); break;
		case 3:
			System.out.println("next semester"); break;
		case 2:
			System.out.println("seasonal semester"); break;
		default:	
			System.out.println("retake"); break;
	

		}
	}

}

//System.out.print(inp);