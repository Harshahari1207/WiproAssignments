/*Write a java program that will return the first half of the string, if the length of the string is even.
 It should return null for odd length string.
Example1)
i/p:TomCat
o/p:Tom
Example2)
i/p:Apron
o/p:null
*/
package String.Assignment4;

import java.util.Scanner;

public class Assignment4 {
	
	static String firstHalf(String str) {
		
		String s1 = str.substring(0, str.length()/2);;
		if(str.length()%2 == 0)
			return s1;
		else
			return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.nextLine();
		System.out.println(firstHalf(str));

	}

}
