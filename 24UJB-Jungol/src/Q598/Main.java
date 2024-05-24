package Q598;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char inp = '\0';
//			1.java style
			for (;;) {
				inp = sc.next().charAt(0);
			//	System.out.print(inp);
			
			if (Character.isAlphabetic(inp)) {
				System.out.println(inp);
			} else if (Character.isDigit(inp)) {
				System.out.println((int) inp);
			} else {
				break;
			}
		}
			sc.close();
	}
}
		
		
//		2.C style
//		for (;;) {
//			inp = sc.next().charAt(0);
//		//	System.out.print(inp);
//			
//			if(('a'<=inp&&inp<='z') || ('A'<=inp&&inp <='Z')) { // 문자를 숫자 아스키 코드로 변환하여 진위여부 판단
//				System.out.print(inp);
//				
//			}else if ('0'<=inp&& inp <='9'){ // 숫자
//				System.out.println((int)inp);
//			}else {
//				break;
//			}
//		}
		
		
		
		
		//		String str = sc.nextLine();
//		int num = sc.nextInt();
//		sc.close();
//		String str;
//		int num;
	//	int sum=0;
		
//		for (;;) {
//			if (str.equals("A")) {
//			System.out.println(str);
//
//			}
//			else if (num == '1') {
//			System.out.println((char)num);
//			}
//			else {
//				break;
//			}
//		}

