package Q532;


import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			double Z = scanner.nextDouble();
			double X = scanner.nextDouble();
				scanner.close();

			//	System.out.println(Z);
			//	System.out.println(X);
				
				if(Z>= 4.0 && X >=4.0) {
					System.out.println("A");
				}else if (Z>= 3.0 && X >=3.0) {
					System.out.println("B");
				}else  {
					System.out.println("C");
				}
		}
	}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//			double (Z+X) = Y;
//			double (Y/2) = score;
//			
//			
//			if (score >= 4.0) {
//				System.out.print("A");
//				if(score >=3.0) {
//					System.out.print("B");
//				}if else (score < 3){
//					System.out.print("C");
//		
//	
//				}
//			}

	//	double score = scanner.nextLine();
			//int A = Integer.parseInt(score);