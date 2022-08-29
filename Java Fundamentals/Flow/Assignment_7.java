/*
 * 	
 Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
 */

import java.util.Scanner;

public class Assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = s.next().charAt(0);
		int ascii;
		if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch+ "->");
			 ascii = (int)ch;
			ch = (char)(ascii-32);
			System.out.println(ch);
			
		}
		else {
			
			System.out.println(ch+ "->" );
			ascii = (int)ch;
			ch = (char)(ascii+32);
			System.out.println(ch);
		}

	}

}
