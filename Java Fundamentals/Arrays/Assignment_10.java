/*
Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/
import java.util.Scanner;

public class Assignment_10 {
	
	static int[] evenodd(int[] a) {
		int len = a.length;
		int temp = 0;
		int pos = 0;

		for (int i = 0; i < a.length; i++) {
		if (a[i] % 2 == 0) {
		temp = a[pos];
		a[pos] = a[i];
		a[i] = temp;
		pos++;
		}
		}

		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = s.nextInt();
		System.out.print("Enter the elements: ");
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		
		evenodd(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
