/*
 * 	
 Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
 */

import java.util.Scanner;

public class Assignment_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int su = 0, m;
		System.out.print("Enter any number: ");
		int n = s.nextInt();
		while(n != 0) {
			m = n%10;
			su = m+su*10;
			n = n/10;
		}
		
		System.out.println(su);

	}

}
