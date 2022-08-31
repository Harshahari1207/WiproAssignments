/*Given 2 strings, a and b, return a new string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).
If input is "hi" and "hello", then output will be "hihellohi".
*/
package String.Assignment6;

import java.util.Scanner;

public class Assignment6 {
	
	static String shortLong(String str1, String str2) {
		String s1 = "";
		if(str1.length() == str2.length())
			return "Enter the Strings with different lengths";
		else if(str1.length() < str2.length())
			return str1+str2+str1;
		else
			return str2+str1+str2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter String2: ");
		String s2 = sc.nextLine();
		
		System.out.println(shortLong(s1, s2));

	}

}
