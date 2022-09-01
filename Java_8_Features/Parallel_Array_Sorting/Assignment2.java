package Parallel_Array_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		char[] array = str.toCharArray();
		Arrays.parallelSort(array);
		str = new String(array);
		System.out.println(str);

	}

}
