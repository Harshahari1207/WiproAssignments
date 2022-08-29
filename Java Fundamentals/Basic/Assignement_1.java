/*
  Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 

Example1)
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

Example2)
If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 

[Note: It is mandatory to pass two arguments in command line]
 */

import java.util.Scanner;

public class Assignement_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s1 = s.nextLine();
		System.out.print("Enter second string: ");
		String s2 = s.nextLine();
		System.out.println(s1+ " Technologies "+s2);

	}

}
