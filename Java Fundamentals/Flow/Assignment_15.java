/*
 *  Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
 */

import java.util.Scanner;

public class Assignment_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int rows, num = 1, counter, j;
		System.out.print("Enter number rows: ");
		rows = s.nextInt();
		for(counter = 0; counter<=rows; counter++) {
			for(j=1; j <= counter; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
