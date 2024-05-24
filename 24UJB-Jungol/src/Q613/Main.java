package Q613;
	
	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student st1 = new Student
	}
}
	Class Student{
		private String name;
		private String school;
		private int grade;
		
		public Student(String name,String school,int grade) {
			this.name = name;
			this.school = school;
			this.grade = grade;
		}
		
		public void print () {
			System.out.println("Name : " + name);
			System.out.println("School : " + school);
			System.out.println("Grdae : " + grade);
		}
		
		public String getname() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSchool() {
			return school;
		}
		public void setschool(String school) {
			this.school = school;
		}
		public int getgrade() {
			return grade;
		}
		public void sergrade(int grade) {
			this.grade = grade;
		}
}

