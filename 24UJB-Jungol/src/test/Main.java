package test;

import java.util.Scanner;
import test.Grade;


public class Main  {
	 public Grade grade;
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade grade = new Grade();
		String A = sc.nextLine();
		String B = sc.nextLine();
		int C = sc.nextInt();
		sc.close();
		grade.setName(A);
		grade.setSchool(B);
		grade.setGrade(C);
		
		
		System.out.println("Name : " + grade.getName());
		System.out.println("School : " + grade.getSchool());
		System.out.println("Grade : " + grade.getGrade());	
	}

}
