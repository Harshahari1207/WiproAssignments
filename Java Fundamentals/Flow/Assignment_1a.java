/*
 *  A) Write a program to check if a given integer number is Positive, Negative, or Zero. 
 
 */

import java.util.Scanner;

public class Assignment_1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int a = s.nextInt();
		if(a == 0)
			System.out.print("Entered number is Zero");
		else if(a<0)
			System.out.print("Entered number is Negative");
		else
			System.out.print("EnterEd number is Positive");

	}

}
