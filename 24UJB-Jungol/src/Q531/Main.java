package Q531;
// import java.util.Scanner�� *�� ���̸� ��� Ŭ������ �����
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					double A = scanner.nextDouble();

					scanner.close();
				
					if ( A <= 50.80) {
						System.out.println("Flyweight");
					} else if (A <= 61.23) {
						System.out.println("Lightweight");
					}  else if (A <= 72.57) {
						System.out.println("Middleweight");
					}  else if (A <= 88.45) {
						System.out.println("Cruiserweight");
					} else {
						System.out.println("Heavyweight");
					}				
							
			
			}
		}