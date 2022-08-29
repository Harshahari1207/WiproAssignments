/*
 *  Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
 */

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the gender: ");
		String sc = s.nextLine();
		System.out.print("Enter the age fo the person: ");
		int age = s.nextInt();
		
		if(sc == "female" ) {
			if(age >= 1 && age <= 58)
			System.out.print("the percentage of interest is 8.2%.");
		else if(age >= 59 && age <= 100)
			System.out.print("the persentage of interst is 9.2%.");
		else
			System.out.print("No result");
		}
		else 
		{
		if(age >= 1 && age <= 58)
			System.out.print("the persentage of interest is 8.4%.");
		else if(age >= 59 && age <= 100)
			System.out.print("the percentage of interest is 10.5%.");
		else
			System.out.print("No result");
		}
		
			

	}

}
