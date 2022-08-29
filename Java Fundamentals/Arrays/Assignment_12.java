/*	
 Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
		*/

import java.util.Scanner;

public class Assignment_12 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 3 elements in a: ");
		int a[] = new int[3];
		for(int i=0; i<3; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Enter 3 elements in b: ");
		int b[] = new int[3];
		for(int i=0; i<3; i++) {
			b[i] = s.nextInt();
		}
		
		System.out.println(a[1]+ "," +b[1]);

	}

}
