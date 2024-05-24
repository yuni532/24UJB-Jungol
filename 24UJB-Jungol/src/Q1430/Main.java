package Q1430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = (A*B*C);
		int cnt = 0;
		String num = Integer.toString(D);
		int [] arr = new int[num.length()];
	
		for(int i=0;i<arr.length;i++) {
			arr[i] = num.charAt(i)-'0';
		}
		for(int j =0;j<10;j++) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==j) {
				cnt++;
			}
		}
		System.out.println(cnt);
		cnt=0;
		}

	}

}
