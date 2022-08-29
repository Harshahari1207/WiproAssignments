/*
 *  Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
 */

import java.util.Scanner;

public class Assignment_17 {

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
		
		if(su == n)
			System.out.print("Not Palindrome");
		else
			System.out.print("Palindrome");

	}

}
