package Q614;
 import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String schoolName = sc.nextLine();
		int grade = sc.nextInt();
		sc.close();
//		System.out.println(schoolName);
//		System.out.println(grade );
		Person p1 = new Person();
		Person p2 = new Person(schoolName,grade);
		
		p1.print();
		p2.print();
	}
}
class Person{
	private String schoolName;
	private int grade;
	
	public Person() {
		this.schoolName = "Jejuelementary";
		this.grade = 6;
	}
	public Person(String schoolName,int grade) {
		this.schoolName = schoolName;
		this.grade = grade;
	}
		
public void print() {
	System.out.println(grade + " grade in "+ schoolName + " School");
		
	}
}

	
