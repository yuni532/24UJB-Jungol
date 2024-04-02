package Q596;
	import java.util.Scanner;
	
	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			String str = sc.next();
			int num = sc.nextInt();
			sc.close();
			if (str.length() > num) {
				for (int i = str.length() - 1, cnt = 0; num > cnt; i--, cnt++) {

					System.out.print(str.charAt(i));
				}
			} else {
				for (int i = str.length() - 1; i >= 0; i--) {
					System.out.print(str.charAt(i));
				}

			}
		}
	}

//푸는중이엇음