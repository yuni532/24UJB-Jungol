package Q1071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A = sc.nextInt();
		int C ;
		int[] arr = new int [A];
		int cnt = 0;
		int num = 0;
		for (int i=0;i<A;i++) {
			C = sc.nextInt();
		 arr[i] = C;
		}
		int D = sc.nextInt();
	
		for(int i = 0; i<A;i++) {
			if (arr[i]<=D) {
				if(D%arr[i]==0)	{
					
					cnt+=arr[i];
				} 
			}
				if ( arr[i]>=D) {
					if(arr[i]%D==0)	{
					num+=arr[i];
				}
			}
			
		}
		System.out.println(cnt);
		System.out.println(num);
		
	}

}
