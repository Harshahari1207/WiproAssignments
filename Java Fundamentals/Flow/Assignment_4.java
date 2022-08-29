/*
 * 	
 Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
 */

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter two alphabets ");
		char x = s.next().charAt(0);
		char y = s.next().charAt(0);
		if(x > y) {
			System.out.println(y+ "," +x);
			
		}
		else {
			System.out.println(x+ "," +y);
		}

	}

}
