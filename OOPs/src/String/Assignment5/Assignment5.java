/*Write a java program that accepts a string and 
returns a new string without the first and last character of the input string.
Example1)
i/p:Suman
o/p:uma
*/
package String.Assignment5;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.nextLine();
		String str1 = str.substring(1, str.length()-1);
		System.out.println(str1);

	}

}
