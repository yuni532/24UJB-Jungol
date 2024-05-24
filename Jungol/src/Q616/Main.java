import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle tri = new Triangle();
		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			Point p = new Point(x, y);
			tri.setPoint(i, p);
		}
		sc.close();

//		tri.print();
		tri.printGravity();
	}
}

class Triangle {
	private Point[] p;

	public Triangle() {
		p = new Point[3]; //idx 값 3 으로 설정
	}

	public void setPoint(int idx, Point point) { // idx = 3,  point = 3
		p[idx] = point;// p[3]=3;
	}

	public void print() {
		for (int i = 0; i < p.length; i++) {
			p[i].print(); // i=0이니 0부터 값 출력
		}
	}

	public void printGravity() {
		double x = 0.0, y = 0.0; // 소숫점으로 출력해야해서 더블로 설정 

		for (int i = 0; i < p.length; i++) {// i=0 부터 p의 길이까지
			x += p[i].getX(); //x+1 = p의 idx i값에 있는 x 출력
			y += p[i].getY();// y+1 = p의 idx i값에 있는 y출력
		}
		
		System.out.printf("(%.1f %.1f)\n", x / p.length, y / p.length);
	}
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x; // 같은 클래스의 x 
		this.y = y;// 같은 클래스의  y
	}

	public void print() {
		System.out.println(x + " : " + y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}