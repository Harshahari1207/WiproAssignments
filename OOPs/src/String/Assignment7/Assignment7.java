/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
 otherwise return the string unchanged. 
If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
*/
package String.Assignment7;

import java.util.Scanner;

public class Assignment7 {
	
	static String xString(String str) {
		if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
			return str.substring(1, str.length()-1);
		else
			return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s = sc.nextLine();
		System.out.println(xString(s));


	}

}