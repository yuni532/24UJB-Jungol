package Q128;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int num;
		int cnt = 0;
		for (int j = 0; j <=arr.size(); j++) {
			num = sc.nextInt();
			arr.add(num);
			if (num != 0) {
				for (int i = 0; i < 1; i++) {
					if ((num % 3) != 0) {
						if ((num % 5) != 0) {
							cnt++;
						}
					}
				}
			}else {
				break;
			}
			
		}
						

		System.out.println(cnt);

	}

}
