/*
 *  Write a program to check if a given integer number is odd or even.
 */

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int a = s.nextInt();
		if(a%2 == 0)
			System.out.print("Entered number is Even!");
		else
			System.out.print("Entered number is Odd!");

	}

}
