package Assignment3;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		String o = String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
		System.out.println(o);
		
		s.close();

	}

}
