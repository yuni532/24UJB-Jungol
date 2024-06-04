package Q1338;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        char[][] charArr = new char[n][n];
         
        char start = 'A';
 
        for(int i = 0; i <= n; i++) {
            int k = n-1;
            for(int j = i; j < n; j++) {
                if(start > 'Z') start = 'A';
                charArr[j][k--] = start++;
            }
        }
         
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(charArr[i][j] == '\0') System.out.print("  ");
                else System.out.print(charArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int A = 0;
//		A = N;
//		char chr = 'A';
//		char num = chr;
//		int [][] arr = new int[N][N];
//	
//			
//		for (int i = 0; i <A; i++) {
//			chr = num++; 
//			N = A;
//			
//			
//			for (int j = A-1 ; j >=0; j--) {
//				if(chr>'Z') {chr= 'A';
//				arr[i][j]= chr++;
//				}
//				
//					
//				if (i < j) {
//					
//					System.out.print(" "+" ");
//				} else if (i >= j) {
//					if(i==j) {
//						arr[i][j]= (chr);
//						System.out.print((char)arr[i][j]+" ");
//					//	System.out.print(" ");
//						
//					} else if (i>j){
//						
//			if (chr <'Z') {
//				
//						chr++;
////						num = chr;
//						chr += N - 2;						
//						N--;
//						arr[i][j]=chr;
//						System.out.print((char)arr[i][j]+" ");
//			} else if (chr >='Z'){
//				chr = 'A'-1;
//				chr ++;
//				System.out.print((char)arr[i][j]+" ");
//			}
//						//System.out.print(" ");
//					}
//					
//					 
//				
//
//				}
//			}
//			System.out.println("");
//		}
//
//	}
//
//}
////3열 C 까진 됨 그 후는 디버그 후 확인해서 코드 이어서 작성하기

