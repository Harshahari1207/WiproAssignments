//Write a Program to check whether a given String is Palindrome or not.
package String.Assignment1;

import java.util.Scanner;

public class Palindrome {
	
	static boolean isPalindrome(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;
			}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		if(isPalindrome(s1)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not Palindrome");
		}

	}

}
