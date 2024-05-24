package Q540;
 import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//int A = sc.nextInt();
//	

	do {
		int A = sc.nextInt();
		if (A == -1) {
			break;
		} else if ((A % 3) == 0) {
			System.out.println(A / 3);
		}
	} while (true);
	sc.close();
}
}


 
   
//   
//      for(;;) {
//         int a = sc.nextInt();
//         if(a%3==0)
//            System.out.println(a/3);
//         
//          else if(a==-1) {
//            System.out.println();
//         sc.close();
//         break;
//      
//   }
//}
