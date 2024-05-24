package Q571;
	import java.util.Scanner;
public class Main {
 public static void str () {
	 System.out.println("~!@#$^&*()_+|");
	 
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();
		for (int i=0;i<A;i++) {
			str();
		}
	}

}


// method 생성 후 출력하는 방식
//
//import java.util.Scanner;
//
//public class Main {
//public static void printstr() {
//System.out.println("~!@#$^&*()_+|");
//}
//
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int A = sc.nextInt();
//	sc.close();
//	for (int i=0;i<A;i++) {
//		printstr();
//	}
//}
//}