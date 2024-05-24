package Q618;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] ps = new Person[5]; 
	
		for(int i=0;i<ps.length;i++) {
			String name = sc.next();
			int tall = sc.nextInt();
			double weight = sc.nextDouble();
		
			ps[i] = new Person(name,tall,weight);
	//	ps[i].print();
		}
		sc.close();
		
		
	

			
		Arrays.sort(ps, new Comparator<Person>() {
			@Override
		public int compare(Person o1, Person o2) {
				String name1 = o1.getname();
				String name2 = o2.getname();
				
				int strlen = Math.min(name1.length(),name2.length());
				for(int i = 0; i <strlen;i++) {
					if(name1.charAt(i) != name2.charAt(i)) {
						return name1.charAt(i) - name2.charAt(i);
					}
				}
				return 0;
			
			}
		});
		
	
				System.out.println("name ");
				for (int i =0; i<ps.length;i++) {
					ps[i].print();
				};
				System.out.print("\n");
			
		
			Arrays.sort(ps, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				double oh1 = o1.getweight();
				double oh2 = o2.getweight();
				if (oh1<oh2)
					return -1;
				else if (oh1 == oh2)
					return 0;
				else
					return 1;
			}
		});
			
		
		
		System.out.println("weight ");
		for (int i =ps.length-1; i>=0;--i) {
			ps[i].print();
			
			
		
		}
	
}
}
		
		
		

		
		
	
	class Person {
		private String name;
		private int tall;
		private double weight;
	public Person (String name, int tall, double weight) { // 持失切 持失
		this.name = name;
		this.tall = tall;
		this.weight = weight;
			} 
	public void print () {
	System.out.println( name + " " + tall + " " + weight);
		}
	public String getname() {
		return name;
	}
	public double getweight() {
		return weight;
	}
		
	
	}

		
	
