package Q1307;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	
	for (int i =A;i>=1;i--) {
	
		for (int j=1;j<=A;j--) {
			
			char D = (char)((j*i)+64);
			//if (D=='Z') {
				
	//		}
			System.out.print(D+" ");
		}
	
		System.out.println("");
	}
	}

}
