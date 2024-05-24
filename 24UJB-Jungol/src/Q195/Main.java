package Q195;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person[] str = new Person[1];

		String	arr = sc.nextLine();
	
		
		String[] mob = arr.split(" ");
		String ret1= mob[0];
		String ret2= mob[1];
		String ret3= mob[2];
		
		String	name = ret1;
		String	tel = ret2;
		String	addr = ret3;
		for(int i=0; i<str.length;i++) {
			str[i] = new Person(name,tel,addr);
			
		}
		for (int i =0; i<str.length;i++) {
		str[0].print();
		
	}

}
}

class Person{
	private String name;
	private String tel;
	private String addr;
	
	public Person(String name,String tel,String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}
	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " +addr);
	}
	public String getname() {
		return name;
	}
	public String gettel() {
		return tel;
	}
	public String getaddr() {
		return addr;
	}
}