/*
Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
*/

import java.util.Scanner;

public class Assignment_11 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int res=0;
		System.out.print("Enter size: ");
		int n = s.nextInt();
		System.out.print("Enter teh elements: ");
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(a[i] == 1 || a[i] == 4)
				res += 1;
			else
				res = 0;
		}
		if(res == a.length)
		System.out.print(true);
		else
		System.out.print(false);
	}

}
