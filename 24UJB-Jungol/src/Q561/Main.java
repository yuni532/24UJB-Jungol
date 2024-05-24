package Q561;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			int [] arr = new int [10];
			for (int i = 0; i<arr.length;i++) {
				arr[i] = sc.nextInt();
				
			}
			int max = 0,min=9999;
			for (int i=0; i<arr.length;i++) {

				if(arr[i]<100) {
					if (max<arr[i]) {
						max =arr[i];
			
					}
				}
					if (arr[i]>=100) {
						if(min>arr[i]) {
							min=arr[i];
						}
					}
			}
						
			
	if (max==0){
		max=100;
	}
	if(min==9999) {
		min=100;
	}
			sc.close();
					System.out.print(max+ " ");
					System.out.print(min);
				
		}

}
