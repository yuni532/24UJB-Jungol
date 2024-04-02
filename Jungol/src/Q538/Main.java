package Q538;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int i = sc.nextInt();
		
			if (i>0) {
		System.out.print("number? ");
		System.out.println("positive integer");
			
		}else if (i < 0) {
			System.out.print("number? ");
			System.out.println("negative number");
		}else if( i == 0){
			System.out.print("number? ");
			break;
			}
			
		}
		sc.close();
	}
}
		
	

			

		// ÇØ°áÇÔ

		
		
		
		
		

		
