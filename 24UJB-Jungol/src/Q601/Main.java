package Q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // str = PROGRAM
		String [] arr;
		arr= str.split("");
		String tmp; // tmp = str��
		String amm;
		String axx;
		int A = str.length(); // 7
		int B = str.length()+1;
		for (int i=0; i<str.length();i++) {
			amm =arr[str.length()-1];  // amm�� ������ �� ����
			arr[i+1]= arr[i];	// ��ĭ�� �̵� 
			if (i+1<A) {
			
				arr[0]= amm;
			System.out.print(arr[i+1]);		
			}
	
				}
			
	//	for(int j = 0; j<str.length();j++) {
		//}
		}
			
		
	
	}


// Ǯ���ϴٰ� ������ 
// �����غ�
