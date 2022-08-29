/*
 * 	
 Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
 */

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any thing: ");
		char c = s.next().charAt(0);
		
		if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
			System.out.print("Entered is Alphabet");
		else if(c >= '0' && c <= '9')
			System.out.print("Entered is Digit");
		else
			System.out.print("Entered is Special character");
		
		

	}

}
