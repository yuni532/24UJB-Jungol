package Q9054;

public class Main {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=4;j++) {
				System.out.print(j + " * " + i + " =");
				System.out.printf("%3d", j*i);
				System.out.print("   ");
			}
			System.out.println(" ");
		}
	}

}
