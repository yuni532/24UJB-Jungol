package Q614;
	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Z = sc.nextLine();
		int B = sc.nextInt();
		sc.close();
		System.out.println(B+" grade in "+ Z+" School");
	
		Q q = new Q();
	q.methodQ();
	}
} 
	class Q {
	
	
	String A=("Jejuelementary");
	int B = (6);
	String C=("Seogwipomiddle");
	int D = (1);
	
	void methodQ() {
		System.out.println(B+" grade in "+ A +" School");
	}
}
	
	
//	}else {
//		a.methodB();
	
//	B b = new B ();
//	b.methodA();
//	b.methodB();
	
//
