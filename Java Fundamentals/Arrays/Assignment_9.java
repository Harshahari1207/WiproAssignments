/*
 Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
*/

import java.util.Scanner;

public class Assignment_9 {
	static int[] outten(int[] a) {
		int i=0;
		while(i<a.length && a[i] != 10)
			i++;
		for(int j=i+1; j<a.length; j++) {
			if(a[j] != 10)
			{
				a[i] = a[j];
				a[j] = 10;
				i++;
			}
		}
		for(; i<a.length; i++)
			a[i] = 0;
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
		
		outten(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
