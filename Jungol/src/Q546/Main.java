package Q546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double num ;
		double sum = 0 ;
		double avg ;
		for(int i=0; i<n;i++) {
			num=sc.nextDouble();
			sum+=num;
			
			}
			avg= sum/n;
			System.out.print("avg : ");
			System.out.printf("%.1f",avg);
			System.out.println("");
			if (avg>80) {
				System.out.print("pass");
			}else {
				System.out.print("fail");
			}
	}

}
