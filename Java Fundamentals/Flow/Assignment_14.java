/*
 *  Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
 */

import java.util.Scanner;

public class Assignment_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int x;
		System.out.print("Enter any number: ");
		int n = s.nextInt();
		while(n != 0) {
			x = n%10;
			n = n/10;
			sum = x+sum;
		}
		System.out.println(sum);

	}

}
