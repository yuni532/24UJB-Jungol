package Q614;
	import java.util.Scanner;
public class A {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		String school = sc.nextLine();
		int grade = sc.nextInt();
//		String school1 = sc.nextLine();
//		int grade1 = sc.nextInt();
//		
		sc.close();
		System.out.println(grade + " grade in " + school + " School");
	}



	class B {
		private String school="";
		private int grade;
		
		public void schoolName (String school, int grade) {
			this.school = school;
			this.grade = grade;
		}
		public void setschool(String school) {
			this.school = school;
		}
		public void print() {
			System.out.println(grade + " grade in "+ school + " School");
		}
		public String getschool() {
			return school;
		}
		public void setgraade(int grade) {
			this.grade = grade;
		}
		public int getgrade() {
			return grade;
		}
	}
}
