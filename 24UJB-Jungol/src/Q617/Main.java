package Q617;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	People[] pp = new People[5];
	
	
	for (int i=0; i<pp.length;i++) {
		String name = sc.next();
		int tall = sc.nextInt();
		
		pp[i] = new People(name, tall);
	//	System.out.println();
	}
	sc.close();

	Arrays.sort(pp, new Comparator<People>() {
		//@Override
		public int compare(People o1, People o2) {
			int oh1 = o1.gettall();
			int oh2 = o2.gettall();
			if (oh1<oh2)
				return -1;
			else if (oh1 == oh2)
				return 0;
			else
				return 1;
		}
	});
	for (int i =0; i<pp.length;i++) {
		pp[0].print();
		break;
	}
	}

}
	
	
	
	
	
	
	
	
	class People{
		private String name;
		private int tall;
		
		public People (String name, int tall){
		this.name = name;
		this.tall = tall;
		}
		public void print() {
			System.out.println(name+ " " + tall);
		}

		
		public int gettall() {
			return tall;
			
		
		}
	}
	

