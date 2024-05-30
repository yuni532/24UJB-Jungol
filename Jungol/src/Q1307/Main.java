 package Q1307;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	
	char[][] arr = new char [A][A];
	
	char str = 'A';
	
	for (int i=0;i<A;i++) {
		for(int j=0;j<A;j++) {
			if (str >'Z') {
				str = 'A';
				arr[i][j]=str;
			str++;
			
			}else {
				
			arr[i][j]= str;
		str++;
			}
		}
	}
		
		for (int i=A-1;i>=0;i--) {
			for(int j=A-1;j>=0;j--) {
		
			System.out.print(arr[j][i]+" ");
	}
		System.out.println("");
	}
	}

}

// 풀어야함