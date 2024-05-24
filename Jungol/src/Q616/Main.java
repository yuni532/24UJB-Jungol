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
		p = new Point[3]; //idx �� 3 ���� ����
	}

	public void setPoint(int idx, Point point) { // idx = 3,  point = 3
		p[idx] = point;// p[3]=3;
	}

	public void print() {
		for (int i = 0; i < p.length; i++) {
			p[i].print(); // i=0�̴� 0���� �� ���
		}
	}

	public void printGravity() {
		double x = 0.0, y = 0.0; // �Ҽ������� ����ؾ��ؼ� ����� ���� 

		for (int i = 0; i < p.length; i++) {// i=0 ���� p�� ���̱���
			x += p[i].getX(); //x+1 = p�� idx i���� �ִ� x ���
			y += p[i].getY();// y+1 = p�� idx i���� �ִ� y���
		}
		
		System.out.printf("(%.1f %.1f)\n", x / p.length, y / p.length);
	}
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x; // ���� Ŭ������ x 
		this.y = y;// ���� Ŭ������  y
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