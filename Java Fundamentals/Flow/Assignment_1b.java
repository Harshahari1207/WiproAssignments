/*
 * B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

     lastDigit(7, 17) → true
     lastDigit(6, 17) → false
     lastDigit(3, 113) → true
 */

import java.util.Scanner;

public class Assignment_1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any two numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		if(a%10 == b%10)
			System.out.print(true);
		else
			System.out.print(false);

	}

}
