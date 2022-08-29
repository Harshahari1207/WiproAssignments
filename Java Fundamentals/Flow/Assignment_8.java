/*
 * Write a program to receive a color code from the user (an Alphabhet). 

The program should then print the color name, based on the color code given. 

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 

If color code provided by the user is not valid then print "Invalid Code".
 */

import java.util.Scanner;

public class Assignment_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter color code through VIBGYOR: ");
		char color = s.next().charAt(0);
		switch(color) {
		case 'V':
			System.out.print("V->Voilet");
			break;
		case 'I':
			System.out.print("I->Indigo");
			break;
		case 'B':
			System.out.print("B->Brown");
			break;
		case 'G':
			System.out.print("G->Green");
			break;
		case 'Y':
			System.out.print("Y->Yellow");
			break;
		case 'O':
			System.out.print("O->Orange");
			break;
		case 'R':
			System.out.print("R->Red");
			break;
		default :
			System.out.print("Invalid Code");
		}

	}

}
