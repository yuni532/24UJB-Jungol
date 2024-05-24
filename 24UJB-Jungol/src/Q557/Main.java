package Q557;
	
	import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] charr = new char[10];
		for (int i=0; i < charr.length; i++) {
			charr[i] = sc.next().charAt(0);
		}
			sc.close();
	//	for(int i= 0; i < 1; i++) {
			System.out.print(charr[0]+ " ");
			System.out.print(charr[3]+ " ");
			System.out.print(charr[6]);
			
			}			
	}
//}

			
			
			
			
			
			
			
			
		//	System.out.printf("%1s%4s%7s",charr[i]);
