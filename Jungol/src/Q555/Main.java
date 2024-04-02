package Q555;
	 import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] charr = new char [10];
		for ( int i = 0; i < charr.length; i++) {
		charr[ i ]  = scanner.next().charAt(0);
		}
		scanner.close();
		for (int  i = 0; i < charr.length; i++) {
			System.out.print(charr[i] + "" );
		}
	}
	
}
		
		
		
		
//		String a = scanner.nextLine();
//		String b = scanner.nextLine();
//		String c = scanner.nextLine();
//		String d = scanner.nextLine();
//		String e = scanner.nextLine();
//		String f = scanner.nextLine();
//		String g = scanner.nextLine();
//		String h = scanner.nextLine();
//		String i = scanner.nextLine();
//		String j = scanner.nextLine();
//		scanner.close();
//		System.out.printf("%10c",a,b,c,d,e,f,g,h,i,j);
//		System.out.print(b);
//		System.out.print(c);
//		System.out.print(d);
//		System.out.print(e);
//		System.out.print(f);
//		System.out.print(g);
//		System.out.print(h);
//		System.out.print(i);
//		System.out.print(j);
		
