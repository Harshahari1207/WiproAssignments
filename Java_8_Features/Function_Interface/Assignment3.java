package Function_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Assignment3 {
	
	static boolean isPalindromeString(String str) {
		str = str.toLowerCase();
		int digitCount = str.length();
		boolean isPalindrome = true;
		
		int range = digitCount/2;
		if(digitCount%2 == 0)
			range--;
		
		for(int i=0; i<= range; i++) {
			if(str.charAt(i) != str.charAt(digitCount-i-1))
				isPalindrome = false;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Aresh", "amma", "sos", "amar", "abcba", "run", "boost", "rar", "Anil", "non"));
		Predicate<String> ispal = str -> isPalindromeString(str);
		list.stream().filter(ispal).forEach(System.out :: println);
		

	}

}
