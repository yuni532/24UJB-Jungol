package Q1840;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int[][] arr = new int [A][B];
	int[] brr = new int [B];
	int chck = 0;
	int cnt =0;
		if (A<100&& B<100) {			
		for (int i =0; i<A; i++) {
			for (int j=0;j<B;j++) {
			int D= sc.nextInt();
			brr[j] = D;
			arr[i][j] = brr[j];
			
			}

		}
		cnt++;
		for (int i =0; i<A; i++) {
			for (int j=0;j<B;j++) {
				if(arr[i][j]==0) {
					System.out.print(arr[i][j]+" ");
				}
				else if(arr[i][j]==1){
				if(arr[i][j-1]==0||arr[i][j+1]==0||arr[i-1][j]==0||arr[i+1][j]==0) {
					arr[i][j]= 2;
					System.out.print(arr[i][j]+" ");
				}else {
					
					System.out.print(arr[i][j]+" ");
				}
//			if (D==1) {
//				cnt++;
//			}
			}
			
			}
			System.out.println("");
	//	System.out.println(cnt+" ");	
			

		}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		cnt++;
		for (int i =0; i<A; i++) {
			for (int j=0;j<B;j++) {
				if (arr[i][j]==2) {
					arr[i][j]=0;
				}
				}
		}
		for (int i =0; i<A; i++) {
			for (int j=0;j<B;j++) {
				if(arr[i][j]==0) {
			System.out.print(arr[i][j]+" ");
		}
		else if(arr[i][j]==1){
		if(arr[i][j-1]==0||arr[i][j+1]==0||arr[i-1][j]==0||arr[i+1][j]==0) {
			arr[i][j]= 2;
			System.out.print(arr[i][j]+" ");
		}else {
			
			System.out.print(arr[i][j]+" ");
		}
		}
		}
			System.out.println("");
	}
		cnt++;
		System.out.println(cnt);
		for (int i =0; i<A; i++) {
			for (int j=0;j<B;j++) {
				if(arr[i][j]==2) {
					chck++;
				}
				
				}
		}
		System.out.print(chck);
	}
}
