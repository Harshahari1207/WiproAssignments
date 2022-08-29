/*
  Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
 */

import java.util.Scanner;

public class Assignment_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = args.length;
		int i;
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[4][4];
		
		System.out.print("Enter the elements in the array: ");
			int k=0;
			for(i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					arr[i][j] = s.nextInt();
					k++;
				}
			}
			
			
			
			System.out.print("The given array is : ");
			for(i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
			if(arr.length<4) {
				System.out.print("Enter 4 elements: ");
			}
			
			if(arr.length==4) {	
		System.out.print("Reversed array for given array: ");
		for( i=1; i>=0; i--) {
			for(int j=1; j>=0; j--) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
			
			

	}
  }
}
		
		 