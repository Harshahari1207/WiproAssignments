/*Write a java program that will concatenate 2 strings and return the result. 
The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar
Example2)
i/p:Mark,kate
o/p:markate
*/
package String.Assignment2;

import java.util.Scanner;

public class Assignment2 {
	
	static String concate(String s1, String s2) {
		String outStr = "";
		if(s1.charAt(s1.length()-1) == s2.charAt(0))
			outStr = s1.substring(0, s1.length()-1) + s2;
		else
			outStr = s1+ " " +s2;
		return outStr.toLowerCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String str1 = scan.nextLine();
		System.out.print("Enter the 2nd string: ");
		String str2 = scan.nextLine();
	
		System.out.println(concate(str1, str2));

	}

}
