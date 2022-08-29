/*
 	
 Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
 */

import java.util.Scanner;

public class Assignment_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = args.length;
		Scanner s = new Scanner(System.in);
		int[] arr[] = new int[3][3];
		System.out.print("Enter the elements: ");
		if(a<9) {
			System.out.print("Enter 9 values");
		}
		
		int k=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
			int max = Integer.MIN_VALUE;
			System.out.print("The given array is: ");
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(arr[i][j]>max) 
					max = arr[i][j];
					System.out.print(arr[i][j]+ " ");
					
				}
				System.out.println();
			}
			System.out.println("the maximum value is: " +max);
			
		}

	}


