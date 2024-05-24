package Q574;
 import java.util.Scanner;
public class Main {
 public int Num(int n1, int n2 ,int n3) {
	 int ret = 0;
	 //if문 미완성
	 
	 if (n1<n2) {
		 if(n2<n3) {
			 ret = n3;
		 }else  {
			 ret = n2;
		 }
	 }if (n1<n3) {
		 if(n3<n2) {
			ret = n2; 
		 }else {
			ret = n1;
		 }
	 }
	 return ret;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
//		int A = Math.max(n1,n2);
//		int B= Math.max(A, n3);
//		System.out.println(B);
		Main m=null;
		m = new Main();
		m.Num (num1,num2,num3);
	
	}
	}

